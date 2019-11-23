
package dominio;
import com.teamdev.jxmaps.*;
import com.teamdev.jxmaps.swing.MapView;
import java.awt.BorderLayout;
import javax.swing.*;

public class Mapa extends MapView {
    private Map map;
     //Constructor
    public Mapa (String nombreMapa){
        JFrame frame = new JFrame(nombreMapa);
        
        setOnMapReadyHandler(new MapReadyHandler() {
            
            @Override
            public void onMapReady(MapStatus status){
              if(status == MapStatus.MAP_STATUS_OK){
                  map = getMap();
                  MapOptions mapOptions = new MapOptions();
                  MapTypeControlOptions controlOptions = new MapTypeControlOptions();
                  mapOptions.setMapTypeControlOptions(controlOptions);
                  map.setOptions(mapOptions);
                  map.setCenter(new LatLng(-34.903160, -56.170284));
                  map.setZoom(11.0);
                  
                  
                  Marker mark1 = new Marker(map);        
                  mark1.setPosition(new LatLng(-34.894891, -56.099988));
        
                  Marker mark2 = new Marker(map);
                  mark2.setPosition(new LatLng(-34.829551, -56.272001));
        
                  Marker mark3 = new Marker(map);
                  mark3.setPosition(new LatLng(-34.923603, -56.158539));
        
                  Marker mark4 = new Marker(map);
                  mark4.setPosition(new LatLng(-34.915133, -56.155370));
                  
                  
                
              }  
            }

        });
        frame.add(this, BorderLayout.CENTER);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setSize(952, 683);
        frame.setVisible(true);
    }
}
