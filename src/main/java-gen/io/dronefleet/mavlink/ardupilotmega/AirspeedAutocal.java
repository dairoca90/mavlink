package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * Airspeed auto-calibration 
 */
@MavlinkMessageInfo(
        id = 174,
        crc = 167
)
public final class AirspeedAutocal {
    private final float vx;

    private final float vy;

    private final float vz;

    private final float diffPressure;

    private final float eas2tas;

    private final float ratio;

    private final float stateX;

    private final float stateY;

    private final float stateZ;

    private final float pax;

    private final float pby;

    private final float pcz;

    private AirspeedAutocal(float vx, float vy, float vz, float diffPressure, float eas2tas,
            float ratio, float stateX, float stateY, float stateZ, float pax, float pby,
            float pcz) {
        this.vx = vx;
        this.vy = vy;
        this.vz = vz;
        this.diffPressure = diffPressure;
        this.eas2tas = eas2tas;
        this.ratio = ratio;
        this.stateX = stateX;
        this.stateY = stateY;
        this.stateZ = stateZ;
        this.pax = pax;
        this.pby = pby;
        this.pcz = pcz;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * GPS velocity north m/s 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 4
    )
    public final float vx() {
        return this.vx;
    }

    /**
     * GPS velocity east m/s 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 4
    )
    public final float vy() {
        return this.vy;
    }

    /**
     * GPS velocity down m/s 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4
    )
    public final float vz() {
        return this.vz;
    }

    /**
     * Differential pressure pascals 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4
    )
    public final float diffPressure() {
        return this.diffPressure;
    }

    /**
     * Estimated to true airspeed ratio 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4
    )
    public final float eas2tas() {
        return this.eas2tas;
    }

    /**
     * Airspeed ratio 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 4
    )
    public final float ratio() {
        return this.ratio;
    }

    /**
     * EKF state x 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 4
    )
    public final float stateX() {
        return this.stateX;
    }

    /**
     * EKF state y 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 4
    )
    public final float stateY() {
        return this.stateY;
    }

    /**
     * EKF state z 
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 4
    )
    public final float stateZ() {
        return this.stateZ;
    }

    /**
     * EKF Pax 
     */
    @MavlinkFieldInfo(
            position = 10,
            unitSize = 4
    )
    public final float pax() {
        return this.pax;
    }

    /**
     * EKF Pby 
     */
    @MavlinkFieldInfo(
            position = 11,
            unitSize = 4
    )
    public final float pby() {
        return this.pby;
    }

    /**
     * EKF Pcz 
     */
    @MavlinkFieldInfo(
            position = 12,
            unitSize = 4
    )
    public final float pcz() {
        return this.pcz;
    }

    public static final class Builder {
        private float vx;

        private float vy;

        private float vz;

        private float diffPressure;

        private float eas2tas;

        private float ratio;

        private float stateX;

        private float stateY;

        private float stateZ;

        private float pax;

        private float pby;

        private float pcz;

        /**
         * GPS velocity north m/s 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 4
        )
        public final Builder vx(float vx) {
            this.vx = vx;
            return this;
        }

        /**
         * GPS velocity east m/s 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 4
        )
        public final Builder vy(float vy) {
            this.vy = vy;
            return this;
        }

        /**
         * GPS velocity down m/s 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4
        )
        public final Builder vz(float vz) {
            this.vz = vz;
            return this;
        }

        /**
         * Differential pressure pascals 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4
        )
        public final Builder diffPressure(float diffPressure) {
            this.diffPressure = diffPressure;
            return this;
        }

        /**
         * Estimated to true airspeed ratio 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4
        )
        public final Builder eas2tas(float eas2tas) {
            this.eas2tas = eas2tas;
            return this;
        }

        /**
         * Airspeed ratio 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 4
        )
        public final Builder ratio(float ratio) {
            this.ratio = ratio;
            return this;
        }

        /**
         * EKF state x 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 4
        )
        public final Builder stateX(float stateX) {
            this.stateX = stateX;
            return this;
        }

        /**
         * EKF state y 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 4
        )
        public final Builder stateY(float stateY) {
            this.stateY = stateY;
            return this;
        }

        /**
         * EKF state z 
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 4
        )
        public final Builder stateZ(float stateZ) {
            this.stateZ = stateZ;
            return this;
        }

        /**
         * EKF Pax 
         */
        @MavlinkFieldInfo(
                position = 10,
                unitSize = 4
        )
        public final Builder pax(float pax) {
            this.pax = pax;
            return this;
        }

        /**
         * EKF Pby 
         */
        @MavlinkFieldInfo(
                position = 11,
                unitSize = 4
        )
        public final Builder pby(float pby) {
            this.pby = pby;
            return this;
        }

        /**
         * EKF Pcz 
         */
        @MavlinkFieldInfo(
                position = 12,
                unitSize = 4
        )
        public final Builder pcz(float pcz) {
            this.pcz = pcz;
            return this;
        }

        public final AirspeedAutocal build() {
            return new AirspeedAutocal(vx, vy, vz, diffPressure, eas2tas, ratio, stateX, stateY, stateZ, pax, pby, pcz);
        }
    }
}