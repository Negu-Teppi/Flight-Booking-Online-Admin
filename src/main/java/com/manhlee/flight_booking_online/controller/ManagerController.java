package com.manhlee.flight_booking_online.controller;

import com.manhlee.flight_booking_online.entities.*;
import com.manhlee.flight_booking_online.enums.SeatStatus;
import com.manhlee.flight_booking_online.enums.SeatType;
import com.manhlee.flight_booking_online.service.AircraftService;
import com.manhlee.flight_booking_online.service.AirportService;
import com.manhlee.flight_booking_online.service.CityService;
import com.manhlee.flight_booking_online.service.FlightRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ServletContext servletContext;

    @Autowired
    private AircraftService aircraftService;

    @Autowired
    private AirportService airportService;

    @Autowired
    private CityService cityService;

    @Autowired
    private FlightRouteService flightRouteService;

    @RequestMapping("/home")
    public String viewHome(Model model) {

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = principal.toString();
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
        }
        model.addAttribute("message", "Hello Manager: " + username);
        return "manager/home";
    }
    @RequestMapping("/view/aircraft")
    public String viewAircraft(Model model){
        model.addAttribute("aircrafts", aircraftService.getAircrafts());
        return "manager/setup/aircraft/view-aircraft";
    }
    @RequestMapping("/aircraft/add-aircraft")
    public String addAircraft(Model model){
        model.addAttribute("aircraft", new AircraftEntity());
        model.addAttribute("action", "add");
        return "manager/setup/aircraft/edit-aircraft";
    }

    @RequestMapping(value = "/aircraft/result", method = RequestMethod.POST)
    public String resultAircraft(@ModelAttribute("aircraft") AircraftEntity aircraft){

//
//        aircraftService.save(aircraft);
        List<MultipartFile> files = aircraft.getFiles();
        List<ImageEntity> images = new ArrayList<>();
        if(files!=null && files.size()>0){
            for(MultipartFile file : files){
                ImageEntity image = new ImageEntity();
                try {
                    image.setName(file.getOriginalFilename());
                    images.add(image);

                    String fileName = file.getOriginalFilename();
                    File imageFile = new File(servletContext.getRealPath("/resources-management/image"), fileName);
                    file.transferTo(imageFile);
                } catch (IOException e){
                    e.printStackTrace();
                }
                image.setAircraft(aircraft);
            }
            aircraft.setImages(images);
            aircraftService.save(aircraft);
        }
        return "redirect:/manager/view/aircraft";
    }

    @RequestMapping(value = "/aircraft/edit/{id}")
    public String editAircraft(Model model, @PathVariable("id") int id){

        model.addAttribute("aircraft", aircraftService.getAircraft(id));
        model.addAttribute("action", "update");
        return "manager/setup/aircraft/edit-aircraft";
    }

    @RequestMapping("/aircraft/delete/{id}")
    public String updateAircraft(@PathVariable("id") int id){

        aircraftService.deleteAircraft(id);
        return "redirect:/manager/view/aircraft";
    }

    @RequestMapping("/view/airport")
    public String viewAirport(Model model){
        model.addAttribute("airports", airportService.getAirports());
        return "manager/setup/airport/view-airport";
    }

    @RequestMapping("/airport/add-airport")
    public String addAirport(Model model){
        model.addAttribute("airport", new AirportEntity());
        model.addAttribute("cities", cityService.getCities());
        model.addAttribute("action", "add");
        return "manager/setup/airport/edit-airport";
    }

    @RequestMapping(value = "/airport/result", method = RequestMethod.POST)
    public String resultAirport(@ModelAttribute("airport") AirportEntity airport){

        System.out.println(airport.getAirportName().toString());
//
//        airportService.save(airport);
        List<MultipartFile> files =  airport.getFiles();
        List<ImageEntity> images = new ArrayList<>();
        if(files!=null && files.size()>0){
            for(MultipartFile file : files){
                ImageEntity image = new ImageEntity();
                try {
                    image.setName(file.getOriginalFilename());
                    images.add(image);

                    String fileName = file.getOriginalFilename();
                    File imageFile = new File(servletContext.getRealPath("/resources-management/image"), fileName);
                    file.transferTo(imageFile);
                } catch (IOException e){
                    e.printStackTrace();
                }
                image.setAirport(airport);
            }
            airport.setImage(images);
            airportService.save(airport);
        }
        return "redirect:/manager/view/airport";
    }

    @RequestMapping(value = "/airport/edit/{id}")
    public String editAirport(Model model, @PathVariable("id") int id){

        model.addAttribute("airport", airportService.getAirport(id));
        model.addAttribute("cities", cityService.getCities());
        model.addAttribute("action", "update");
        return "manager/setup/airport/edit-airport";
    }

    @RequestMapping("/airport/delete/{id}")
    public String deleteAirport(@PathVariable("id") int id){

        airportService.deleteAirport(id);
        return "redirect:/manager/view/airport";
    }

    @RequestMapping("/flight-route/view")
    public String viewFlightRoute(Model model){
        model.addAttribute("flightRoutes", flightRouteService.getFlightRoutes());
        return "manager/setup/flight-route/view-flightRoute";
    }

    @RequestMapping(value = "/flight-route/add")
    public String addFlightRoute(Model model){
        model.addAttribute("flightRoute", new FlightRouteEntity());
        model.addAttribute("airports", airportService.getAirports());
        model.addAttribute("action", "add");
        return "manager/setup/flight-route/edit-flight-route";
    }

    @RequestMapping(value = "/flight-route/result", method = RequestMethod.POST)
    public String resultFlightRoute(@ModelAttribute("flightRoute") FlightRouteEntity flightRoute){
        flightRouteService.save(flightRoute);
        return "redirect:/manager/flight-route/view";
    }

    @RequestMapping("/flight-route/edit/{id}")
    public String updateFlightRoute(Model model, @PathVariable("id") int id){
        model.addAttribute("flightRoute", flightRouteService.getFlightRoute(id));
        model.addAttribute("airports", airportService.getAirports());
        model.addAttribute("action", "update");
        return "manager/setup/flight-route/edit-flight-route";
    }

    @RequestMapping("/flight-route/delete/{id}")
    public String deleteFlightRoute(@PathVariable("id") int id){
        flightRouteService.deleteFlightRoute(id);
        return "redirect:/manager/flight-route/view";
    }

    @RequestMapping("/flight/view")
    public String viewFlight(Model model){
        model.addAttribute("flightRoutes", flightRouteService.getFlightRoutes());
        return "manager/setup/flight-route/view-flightRoute";
    }

    @RequestMapping(value = "/flight/add")
    public String addFlight(Model model){
        model.addAttribute("flight", new FlightEntity());
        model.addAttribute("airports", airportService.getAirports());
        model.addAttribute("action", "add");
        return "manager/setup/flight-route/edit-flight-route";
    }

    @RequestMapping(value = "/flight/result", method = RequestMethod.POST)
    public String resultFlight(@ModelAttribute("flightRoute") FlightRouteEntity flightRoute){
        flightRouteService.save(flightRoute);
        return "redirect:/manager/flight-route/view";
    }

    @RequestMapping("/flight/edit/{id}")
    public String updateFlight(Model model, @PathVariable("id") int id){
        model.addAttribute("flightRoute", flightRouteService.getFlightRoute(id));
        model.addAttribute("airports", airportService.getAirports());
        model.addAttribute("action", "update");
        return "manager/setup/flight-route/edit-flight-route";
    }

    @RequestMapping("/flight/delete/{id}")
    public String deleteFlight(@PathVariable("id") int id){
        flightRouteService.deleteFlightRoute(id);
        return "redirect:/manager/flight-route/view";
    }

    @RequestMapping("/aircraft-seat/view")
    public String viewAircraftSeat(Model model){
        model.addAttribute("flightRoutes", flightRouteService.getFlightRoutes());
        return "manager/setup/flight-route/view-flightRoute";
    }

    @RequestMapping(value = "/aircraft-seat/add")
    public String addAircraftSeat(Model model){
        model.addAttribute("aircraftSeat", new AircraftSeatEntity());
        model.addAttribute("seatTypes", SeatType.values());
        model.addAttribute("seatStatus", SeatStatus.values());
        model.addAttribute("aircrafts", aircraftService.getAircrafts());
        model.addAttribute("action", "add");
        return "manager/setup/aircraft/set-seat";
    }

    @RequestMapping(value = "/aircraft-seat/result", method = RequestMethod.POST)
    public String resultAircraftSeat(@ModelAttribute("aircraft-seat") AircraftSeatEntity aircraftSeatEntity){

        return "redirect:/manager/flight-route/view";
    }

    @RequestMapping("/aircraft-seat/edit/{id}")
    public String updateAircraftSeat(Model model, @PathVariable("id") int id){
        model.addAttribute("flightRoute", flightRouteService.getFlightRoute(id));
        model.addAttribute("airports", airportService.getAirports());
        model.addAttribute("action", "update");
        return "manager/setup/flight-route/edit-flight-route";
    }

    @RequestMapping("/aircraft-seat/delete/{id}")
    public String deleteAircraftSeat(@PathVariable("id") int id){
        flightRouteService.deleteFlightRoute(id);
        return "redirect:/manager/flight-route/view";
    }
}
