/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2ingsoftware;
import com.teamdev.jxmaps.*;
import com.teamdev.jxmaps.swing.MapView;
import java.awt.BorderLayout;
import javax.swing.*;
/**
 *
 * @author Usuario
 */
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
                  map.setCenter(new LatLng(-34.9032784, -56.1881599));
                  map.setZoom(11.0);
                  
                
              }  
            }

        });
        frame.add(this, BorderLayout.CENTER);
        frame.setSize(700, 500);
        frame.setVisible(true);
    }
}
