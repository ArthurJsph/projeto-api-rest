
package dio.api_rest.controller;

import org.springframework.stereotype.Service;

@Service
class LocationService {
  
    public String getRealLocation() {
        double latitude = 20.8008333; 
        double longitude = 47.0133; 
        return "Latitude: " + latitude + ", Longitude: " + longitude;
    }

    
    public double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        double earthRadius = 6371; 
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                   Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                   Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return earthRadius * c;
    }}
