package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
    private int x , y ;
    Job2dDriver driver;

    public SetPositionCommand( Job2dDriver driver,int x,int y) {
        this.driver = driver;
        this.x = x;
        this.y = y;
    }


    @Override
    public void execute() {
        driver.setPosition(x,y);
    }

    public void coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }


}
