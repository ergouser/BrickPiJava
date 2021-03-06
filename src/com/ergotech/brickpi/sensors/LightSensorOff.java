/*
 *  Copyright ErgoTech Systems, Inc 2014
 *
 * This file is made available online through a Creative Commons Attribution-ShareAlike 3.0  license.
 * (http://creativecommons.org/licenses/by-sa/3.0/)
 *
 *  This is a library of functions for the RPi to communicate with the BrickPi.
 */
package com.ergotech.brickpi.sensors;

import com.ergotech.brickpi.BrickPiCommunications;

/**
 * Representation of a Light Off Sensor.
 */
public class LightSensorOff extends Sensor {

    /**
     * Returns an instance of this sensor.
     */
    public LightSensorOff() {

    }

    @Override
    public int decodeValues(byte[] message, int startLocation) {
        value = BrickPiCommunications.decodeInt(10, message, startLocation);
        return startLocation + 10;
    }

    @Override
    public byte getSensorType() {
        return TYPE_SENSOR_LIGHT_OFF;
    }

}
