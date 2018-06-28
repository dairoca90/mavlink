package io.dronefleet.mavlink.matrixpilot;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * The altitude measured by sensors and IMU 
 */
@MavlinkMessageInfo(
        id = 181,
        crc = 55
)
public final class Altitudes {
    private final long timeBootMs;

    private final int altGps;

    private final int altImu;

    private final int altBarometric;

    private final int altOpticalFlow;

    private final int altRangeFinder;

    private final int altExtra;

    private Altitudes(long timeBootMs, int altGps, int altImu, int altBarometric,
            int altOpticalFlow, int altRangeFinder, int altExtra) {
        this.timeBootMs = timeBootMs;
        this.altGps = altGps;
        this.altImu = altImu;
        this.altBarometric = altBarometric;
        this.altOpticalFlow = altOpticalFlow;
        this.altRangeFinder = altRangeFinder;
        this.altExtra = altExtra;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Timestamp (milliseconds since system boot) 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 4
    )
    public final long timeBootMs() {
        return this.timeBootMs;
    }

    /**
     * GPS altitude in meters, expressed as * 1000 (millimeters), above MSL 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 4,
            signed = true
    )
    public final int altGps() {
        return this.altGps;
    }

    /**
     * IMU altitude above ground in meters, expressed as * 1000 (millimeters) 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4,
            signed = true
    )
    public final int altImu() {
        return this.altImu;
    }

    /**
     * barometeric altitude above ground in meters, expressed as * 1000 (millimeters) 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4,
            signed = true
    )
    public final int altBarometric() {
        return this.altBarometric;
    }

    /**
     * Optical flow altitude above ground in meters, expressed as * 1000 (millimeters) 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4,
            signed = true
    )
    public final int altOpticalFlow() {
        return this.altOpticalFlow;
    }

    /**
     * Rangefinder Altitude above ground in meters, expressed as * 1000 (millimeters) 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 4,
            signed = true
    )
    public final int altRangeFinder() {
        return this.altRangeFinder;
    }

    /**
     * Extra altitude above ground in meters, expressed as * 1000 (millimeters) 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 4,
            signed = true
    )
    public final int altExtra() {
        return this.altExtra;
    }

    public static final class Builder {
        private long timeBootMs;

        private int altGps;

        private int altImu;

        private int altBarometric;

        private int altOpticalFlow;

        private int altRangeFinder;

        private int altExtra;

        /**
         * Timestamp (milliseconds since system boot) 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 4
        )
        public final Builder timeBootMs(long timeBootMs) {
            this.timeBootMs = timeBootMs;
            return this;
        }

        /**
         * GPS altitude in meters, expressed as * 1000 (millimeters), above MSL 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 4,
                signed = true
        )
        public final Builder altGps(int altGps) {
            this.altGps = altGps;
            return this;
        }

        /**
         * IMU altitude above ground in meters, expressed as * 1000 (millimeters) 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4,
                signed = true
        )
        public final Builder altImu(int altImu) {
            this.altImu = altImu;
            return this;
        }

        /**
         * barometeric altitude above ground in meters, expressed as * 1000 (millimeters) 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4,
                signed = true
        )
        public final Builder altBarometric(int altBarometric) {
            this.altBarometric = altBarometric;
            return this;
        }

        /**
         * Optical flow altitude above ground in meters, expressed as * 1000 (millimeters) 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4,
                signed = true
        )
        public final Builder altOpticalFlow(int altOpticalFlow) {
            this.altOpticalFlow = altOpticalFlow;
            return this;
        }

        /**
         * Rangefinder Altitude above ground in meters, expressed as * 1000 (millimeters) 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 4,
                signed = true
        )
        public final Builder altRangeFinder(int altRangeFinder) {
            this.altRangeFinder = altRangeFinder;
            return this;
        }

        /**
         * Extra altitude above ground in meters, expressed as * 1000 (millimeters) 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 4,
                signed = true
        )
        public final Builder altExtra(int altExtra) {
            this.altExtra = altExtra;
            return this;
        }

        public final Altitudes build() {
            return new Altitudes(timeBootMs, altGps, altImu, altBarometric, altOpticalFlow, altRangeFinder, altExtra);
        }
    }
}