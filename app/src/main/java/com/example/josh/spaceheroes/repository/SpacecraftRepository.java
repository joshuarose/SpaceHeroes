package com.example.josh.spaceheroes.repository;

import com.example.josh.spaceheroes.model.Astronaut;
import com.example.josh.spaceheroes.model.Spacecraft;

/**
 * Created by joshuarose on 4/19/16.
 */
public class SpacecraftRepository {
    private Spacecraft[] spacecrafts = {
            new Spacecraft("Mercury", "http://www.bisbos.com/images_spacecraft/mercury/mercury_open2_1024.jpg", false),
            new Spacecraft("Gemini", "http://www.rlbeward.net/ModelGallery/GeminiX-1to24.JPG", false),
            new Spacecraft("Apollo", "http://previewcf.turbosquid.com/Preview/2014/05/25__11_26_07/SaturnApollo.lwo_thumbnail1.jpg541ac258-e189-47a3-b3a7-dd98b809c39dLarger.jpg", false),
            new Spacecraft("Atlantis", "https://upload.wikimedia.org/wikipedia/commons/1/16/STS122_Atlantis.jpg", true),
            new Spacecraft("Falcon 9", "http://spaceflight101.com/spacerockets/wp-content/uploads/sites/17/2015/11/crs_f9_dragon_liftoff.jpeg", false)
    };

    public Spacecraft[] getSpacecrafts(){
        return spacecrafts;
    }
}
