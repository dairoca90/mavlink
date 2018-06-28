package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.math.BigInteger;

/**
 * The IMU readings in SI units in NED body frame 
 */
@MavlinkMessageInfo(
        id = 107,
        crc = 108
)
public final class HilSensor {
    private final BigInteger timeUsec;

    private final float xacc;

    private final float yacc;

    private final float zacc;

    private final float xgyro;

    private final float ygyro;

    private final float zgyro;

    private final float xmag;

    private final float ymag;

    private final float zmag;

    private final float absPressure;

    private final float diffPressure;

    private final float pressureAlt;

    private final float temperature;

    private final long fieldsUpdated;

    private HilSensor(BigInteger timeUsec, float xacc, float yacc, float zacc, float xgyro,
            float ygyro, float zgyro, float xmag, float ymag, float zmag, float absPressure,
            float diffPressure, float pressureAlt, float temperature, long fieldsUpdated) {
        this.timeUsec = timeUsec;
        this.xacc = xacc;
        this.yacc = yacc;
        this.zacc = zacc;
        this.xgyro = xgyro;
        this.ygyro = ygyro;
        this.zgyro = zgyro;
        this.xmag = xmag;
        this.ymag = ymag;
        this.zmag = zmag;
        this.absPressure = absPressure;
        this.diffPressure = diffPressure;
        this.pressureAlt = pressureAlt;
        this.temperature = temperature;
        this.fieldsUpdated = fieldsUpdated;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Timestamp (microseconds, synced to UNIX time or since system boot) 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 8
    )
    public final BigInteger timeUsec() {
        return this.timeUsec;
    }

    /**
     * X acceleration (m/s^2) 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 4
    )
    public final float xacc() {
        return this.xacc;
    }

    /**
     * Y acceleration (m/s^2) 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4
    )
    public final float yacc() {
        return this.yacc;
    }

    /**
     * Z acceleration (m/s^2) 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4
    )
    public final float zacc() {
        return this.zacc;
    }

    /**
     * Angular speed around X axis in body frame (rad / sec) 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4
    )
    public final float xgyro() {
        return this.xgyro;
    }

    /**
     * Angular speed around Y axis in body frame (rad / sec) 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 4
    )
    public final float ygyro() {
        return this.ygyro;
    }

    /**
     * Angular speed around Z axis in body frame (rad / sec) 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 4
    )
    public final float zgyro() {
        return this.zgyro;
    }

    /**
     * X Magnetic field (Gauss) 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 4
    )
    public final float xmag() {
        return this.xmag;
    }

    /**
     * Y Magnetic field (Gauss) 
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 4
    )
    public final float ymag() {
        return this.ymag;
    }

    /**
     * Z Magnetic field (Gauss) 
     */
    @MavlinkFieldInfo(
            position = 10,
            unitSize = 4
    )
    public final float zmag() {
        return this.zmag;
    }

    /**
     * Absolute pressure in millibar 
     */
    @MavlinkFieldInfo(
            position = 11,
            unitSize = 4
    )
    public final float absPressure() {
        return this.absPressure;
    }

    /**
     * Differential pressure (airspeed) in millibar 
     */
    @MavlinkFieldInfo(
            position = 12,
            unitSize = 4
    )
    public final float diffPressure() {
        return this.diffPressure;
    }

    /**
     * Altitude calculated from pressure 
     */
    @MavlinkFieldInfo(
            position = 13,
            unitSize = 4
    )
    public final float pressureAlt() {
        return this.pressureAlt;
    }

    /**
     * Temperature in degrees celsius 
     */
    @MavlinkFieldInfo(
            position = 14,
            unitSize = 4
    )
    public final float temperature() {
        return this.temperature;
    }

    /**
     * Bitmask for fields that have updated since last message, bit 0 = xacc, bit 12: temperature, bit 
     * 31: full reset of attitude/position/velocities/etc was performed in sim. 
     */
    @MavlinkFieldInfo(
            position = 15,
            unitSize = 4
    )
    public final long fieldsUpdated() {
        return this.fieldsUpdated;
    }

    public static final class Builder {
        private BigInteger timeUsec;

        private float xacc;

        private float yacc;

        private float zacc;

        private float xgyro;

        private float ygyro;

        private float zgyro;

        private float xmag;

        private float ymag;

        private float zmag;

        private float absPressure;

        private float diffPressure;

        private float pressureAlt;

        private float temperature;

        private long fieldsUpdated;

        /**
         * Timestamp (microseconds, synced to UNIX time or since system boot) 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 8
        )
        public final Builder timeUsec(BigInteger timeUsec) {
            this.timeUsec = timeUsec;
            return this;
        }

        /**
         * X acceleration (m/s^2) 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 4
        )
        public final Builder xacc(float xacc) {
            this.xacc = xacc;
            return this;
        }

        /**
         * Y acceleration (m/s^2) 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4
        )
        public final Builder yacc(float yacc) {
            this.yacc = yacc;
            return this;
        }

        /**
         * Z acceleration (m/s^2) 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4
        )
        public final Builder zacc(float zacc) {
            this.zacc = zacc;
            return this;
        }

        /**
         * Angular speed around X axis in body frame (rad / sec) 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4
        )
        public final Builder xgyro(float xgyro) {
            this.xgyro = xgyro;
            return this;
        }

        /**
         * Angular speed around Y axis in body frame (rad / sec) 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 4
        )
        public final Builder ygyro(float ygyro) {
            this.ygyro = ygyro;
            return this;
        }

        /**
         * Angular speed around Z axis in body frame (rad / sec) 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 4
        )
        public final Builder zgyro(float zgyro) {
            this.zgyro = zgyro;
            return this;
        }

        /**
         * X Magnetic field (Gauss) 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 4
        )
        public final Builder xmag(float xmag) {
            this.xmag = xmag;
            return this;
        }

        /**
         * Y Magnetic field (Gauss) 
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 4
        )
        public final Builder ymag(float ymag) {
            this.ymag = ymag;
            return this;
        }

        /**
         * Z Magnetic field (Gauss) 
         */
        @MavlinkFieldInfo(
                position = 10,
                unitSize = 4
        )
        public final Builder zmag(float zmag) {
            this.zmag = zmag;
            return this;
        }

        /**
         * Absolute pressure in millibar 
         */
        @MavlinkFieldInfo(
                position = 11,
                unitSize = 4
        )
        public final Builder absPressure(float absPressure) {
            this.absPressure = absPressure;
            return this;
        }

        /**
         * Differential pressure (airspeed) in millibar 
         */
        @MavlinkFieldInfo(
                position = 12,
                unitSize = 4
        )
        public final Builder diffPressure(float diffPressure) {
            this.diffPressure = diffPressure;
            return this;
        }

        /**
         * Altitude calculated from pressure 
         */
        @MavlinkFieldInfo(
                position = 13,
                unitSize = 4
        )
        public final Builder pressureAlt(float pressureAlt) {
            this.pressureAlt = pressureAlt;
            return this;
        }

        /**
         * Temperature in degrees celsius 
         */
        @MavlinkFieldInfo(
                position = 14,
                unitSize = 4
        )
        public final Builder temperature(float temperature) {
            this.temperature = temperature;
            return this;
        }

        /**
         * Bitmask for fields that have updated since last message, bit 0 = xacc, bit 12: temperature, bit 
         * 31: full reset of attitude/position/velocities/etc was performed in sim. 
         */
        @MavlinkFieldInfo(
                position = 15,
                unitSize = 4
        )
        public final Builder fieldsUpdated(long fieldsUpdated) {
            this.fieldsUpdated = fieldsUpdated;
            return this;
        }

        public final HilSensor build() {
            return new HilSensor(timeUsec, xacc, yacc, zacc, xgyro, ygyro, zgyro, xmag, ymag, zmag, absPressure, diffPressure, pressureAlt, temperature, fieldsUpdated);
        }
    }
}