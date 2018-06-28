package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * Status of simulation environment, if used 
 */
@MavlinkMessageInfo(
        id = 164,
        crc = 154
)
public final class Simstate {
    private final float roll;

    private final float pitch;

    private final float yaw;

    private final float xacc;

    private final float yacc;

    private final float zacc;

    private final float xgyro;

    private final float ygyro;

    private final float zgyro;

    private final int lat;

    private final int lng;

    private Simstate(float roll, float pitch, float yaw, float xacc, float yacc, float zacc,
            float xgyro, float ygyro, float zgyro, int lat, int lng) {
        this.roll = roll;
        this.pitch = pitch;
        this.yaw = yaw;
        this.xacc = xacc;
        this.yacc = yacc;
        this.zacc = zacc;
        this.xgyro = xgyro;
        this.ygyro = ygyro;
        this.zgyro = zgyro;
        this.lat = lat;
        this.lng = lng;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Roll angle (rad) 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 4
    )
    public final float roll() {
        return this.roll;
    }

    /**
     * Pitch angle (rad) 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 4
    )
    public final float pitch() {
        return this.pitch;
    }

    /**
     * Yaw angle (rad) 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4
    )
    public final float yaw() {
        return this.yaw;
    }

    /**
     * X acceleration m/s/s 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4
    )
    public final float xacc() {
        return this.xacc;
    }

    /**
     * Y acceleration m/s/s 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4
    )
    public final float yacc() {
        return this.yacc;
    }

    /**
     * Z acceleration m/s/s 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 4
    )
    public final float zacc() {
        return this.zacc;
    }

    /**
     * Angular speed around X axis rad/s 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 4
    )
    public final float xgyro() {
        return this.xgyro;
    }

    /**
     * Angular speed around Y axis rad/s 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 4
    )
    public final float ygyro() {
        return this.ygyro;
    }

    /**
     * Angular speed around Z axis rad/s 
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 4
    )
    public final float zgyro() {
        return this.zgyro;
    }

    /**
     * Latitude in degrees * 1E7 
     */
    @MavlinkFieldInfo(
            position = 10,
            unitSize = 4,
            signed = true
    )
    public final int lat() {
        return this.lat;
    }

    /**
     * Longitude in degrees * 1E7 
     */
    @MavlinkFieldInfo(
            position = 11,
            unitSize = 4,
            signed = true
    )
    public final int lng() {
        return this.lng;
    }

    public static final class Builder {
        private float roll;

        private float pitch;

        private float yaw;

        private float xacc;

        private float yacc;

        private float zacc;

        private float xgyro;

        private float ygyro;

        private float zgyro;

        private int lat;

        private int lng;

        /**
         * Roll angle (rad) 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 4
        )
        public final Builder roll(float roll) {
            this.roll = roll;
            return this;
        }

        /**
         * Pitch angle (rad) 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 4
        )
        public final Builder pitch(float pitch) {
            this.pitch = pitch;
            return this;
        }

        /**
         * Yaw angle (rad) 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4
        )
        public final Builder yaw(float yaw) {
            this.yaw = yaw;
            return this;
        }

        /**
         * X acceleration m/s/s 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4
        )
        public final Builder xacc(float xacc) {
            this.xacc = xacc;
            return this;
        }

        /**
         * Y acceleration m/s/s 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4
        )
        public final Builder yacc(float yacc) {
            this.yacc = yacc;
            return this;
        }

        /**
         * Z acceleration m/s/s 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 4
        )
        public final Builder zacc(float zacc) {
            this.zacc = zacc;
            return this;
        }

        /**
         * Angular speed around X axis rad/s 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 4
        )
        public final Builder xgyro(float xgyro) {
            this.xgyro = xgyro;
            return this;
        }

        /**
         * Angular speed around Y axis rad/s 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 4
        )
        public final Builder ygyro(float ygyro) {
            this.ygyro = ygyro;
            return this;
        }

        /**
         * Angular speed around Z axis rad/s 
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 4
        )
        public final Builder zgyro(float zgyro) {
            this.zgyro = zgyro;
            return this;
        }

        /**
         * Latitude in degrees * 1E7 
         */
        @MavlinkFieldInfo(
                position = 10,
                unitSize = 4,
                signed = true
        )
        public final Builder lat(int lat) {
            this.lat = lat;
            return this;
        }

        /**
         * Longitude in degrees * 1E7 
         */
        @MavlinkFieldInfo(
                position = 11,
                unitSize = 4,
                signed = true
        )
        public final Builder lng(int lng) {
            this.lng = lng;
            return this;
        }

        public final Simstate build() {
            return new Simstate(roll, pitch, yaw, xacc, yacc, zacc, xgyro, ygyro, zgyro, lat, lng);
        }
    }
}