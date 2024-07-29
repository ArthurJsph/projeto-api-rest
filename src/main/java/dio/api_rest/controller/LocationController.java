
package dio.api_rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping
    public String getLocation() {
        return locationService.getRealLocation();
    }

    // Endpoint para calcular a distância entre dois pontos
    @GetMapping("/distance")
    public double getDistance(@RequestParam double lat1, @RequestParam double lon1,
                              @RequestParam double lat2, @RequestParam double lon2) {
        return locationService.calculateDistance(lat1, lon1, lat2, lon2);
    }
}
