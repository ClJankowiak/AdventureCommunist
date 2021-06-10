package main;

import generated.World;

import java.io.InputStream;

public class Services {
    World readWorldFromXml(){
        InputStream input = getClass().getClassLoader().getResourceAsStream("world.xml");


        return new World();
    }
    void saveWordlToXml(World world){

    }

}
