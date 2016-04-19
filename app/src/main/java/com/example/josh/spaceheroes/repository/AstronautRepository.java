package com.example.josh.spaceheroes.repository;

import com.example.josh.spaceheroes.R;
import com.example.josh.spaceheroes.model.Astronaut;
import com.example.josh.spaceheroes.model.Launch;

/**
 * Created by joshuarose on 4/19/16.
 */
public class AstronautRepository {
    private Astronaut[] astronauts = {
            new Astronaut("Neil Armstrong", "http://starchild.gsfc.nasa.gov/Images/StarChild/scientists/armstrong.jpg", true),
            new Astronaut("Buzz Aldrin", "http://www.ufoevidence.org/cases/pictures/Aldrin8.jpg", false),
            new Astronaut("John Glenn", "http://media.nj.com/hudson_voices_impact/photo/astrojpg-2e0ab6f2a5044f2e.jpg", false),
            new Astronaut("Gene Cernan", "http://astronautscholarship.org/wp-content/uploads/2012/03/cernan2.jpg", false),
            new Astronaut("Jim Lovell", "http://a3.files.biography.com/image/upload/c_fit,cs_srgb,dpr_1.0,h_1200,q_80,w_1200/MTIwNjA4NjMzNDQyMDQzNDA0.jpg", false)
    };

    public Astronaut[] getAstronauts(){
        return astronauts;
    }
}
