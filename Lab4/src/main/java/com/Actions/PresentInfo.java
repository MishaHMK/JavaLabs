package com.Actions;
import com.Classes.Present;


public class PresentInfo implements Command {

    private final Present present;

    public PresentInfo(Present present) {
        this.present = present;
    }

    @Override
    public void execute(){present.PresentInfo();}
}
