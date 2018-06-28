package io.dronefleet.mavlink.slugs;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * Pilot console PWM messges. 
 */
@MavlinkMessageInfo(
        id = 179,
        crc = 132
)
public final class GpsDateTime {
    private final int year;

    private final int month;

    private final int day;

    private final int hour;

    private final int min;

    private final int sec;

    private final int clockstat;

    private final int vissat;

    private final int usesat;

    private final int gppgl;

    private final int sigusedmask;

    private final int percentused;

    private GpsDateTime(int year, int month, int day, int hour, int min, int sec, int clockstat,
            int vissat, int usesat, int gppgl, int sigusedmask, int percentused) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        this.clockstat = clockstat;
        this.vissat = vissat;
        this.usesat = usesat;
        this.gppgl = gppgl;
        this.sigusedmask = sigusedmask;
        this.percentused = percentused;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Year reported by Gps 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1
    )
    public final int year() {
        return this.year;
    }

    /**
     * Month reported by Gps 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1
    )
    public final int month() {
        return this.month;
    }

    /**
     * Day reported by Gps 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1
    )
    public final int day() {
        return this.day;
    }

    /**
     * Hour reported by Gps 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1
    )
    public final int hour() {
        return this.hour;
    }

    /**
     * Min reported by Gps 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 1
    )
    public final int min() {
        return this.min;
    }

    /**
     * Sec reported by Gps 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 1
    )
    public final int sec() {
        return this.sec;
    }

    /**
     * Clock Status. See table 47 page 211 OEMStar Manual 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 1
    )
    public final int clockstat() {
        return this.clockstat;
    }

    /**
     * Visible satellites reported by Gps 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 1
    )
    public final int vissat() {
        return this.vissat;
    }

    /**
     * Used satellites in Solution 
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 1
    )
    public final int usesat() {
        return this.usesat;
    }

    /**
     * GPS+GLONASS satellites in Solution 
     */
    @MavlinkFieldInfo(
            position = 10,
            unitSize = 1
    )
    public final int gppgl() {
        return this.gppgl;
    }

    /**
     * GPS and GLONASS usage mask (bit 0 GPS_used? bit_4 GLONASS_used?) 
     */
    @MavlinkFieldInfo(
            position = 11,
            unitSize = 1
    )
    public final int sigusedmask() {
        return this.sigusedmask;
    }

    /**
     * Percent used GPS 
     */
    @MavlinkFieldInfo(
            position = 12,
            unitSize = 1
    )
    public final int percentused() {
        return this.percentused;
    }

    public static final class Builder {
        private int year;

        private int month;

        private int day;

        private int hour;

        private int min;

        private int sec;

        private int clockstat;

        private int vissat;

        private int usesat;

        private int gppgl;

        private int sigusedmask;

        private int percentused;

        /**
         * Year reported by Gps 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1
        )
        public final Builder year(int year) {
            this.year = year;
            return this;
        }

        /**
         * Month reported by Gps 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1
        )
        public final Builder month(int month) {
            this.month = month;
            return this;
        }

        /**
         * Day reported by Gps 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1
        )
        public final Builder day(int day) {
            this.day = day;
            return this;
        }

        /**
         * Hour reported by Gps 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1
        )
        public final Builder hour(int hour) {
            this.hour = hour;
            return this;
        }

        /**
         * Min reported by Gps 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 1
        )
        public final Builder min(int min) {
            this.min = min;
            return this;
        }

        /**
         * Sec reported by Gps 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 1
        )
        public final Builder sec(int sec) {
            this.sec = sec;
            return this;
        }

        /**
         * Clock Status. See table 47 page 211 OEMStar Manual 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 1
        )
        public final Builder clockstat(int clockstat) {
            this.clockstat = clockstat;
            return this;
        }

        /**
         * Visible satellites reported by Gps 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 1
        )
        public final Builder vissat(int vissat) {
            this.vissat = vissat;
            return this;
        }

        /**
         * Used satellites in Solution 
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 1
        )
        public final Builder usesat(int usesat) {
            this.usesat = usesat;
            return this;
        }

        /**
         * GPS+GLONASS satellites in Solution 
         */
        @MavlinkFieldInfo(
                position = 10,
                unitSize = 1
        )
        public final Builder gppgl(int gppgl) {
            this.gppgl = gppgl;
            return this;
        }

        /**
         * GPS and GLONASS usage mask (bit 0 GPS_used? bit_4 GLONASS_used?) 
         */
        @MavlinkFieldInfo(
                position = 11,
                unitSize = 1
        )
        public final Builder sigusedmask(int sigusedmask) {
            this.sigusedmask = sigusedmask;
            return this;
        }

        /**
         * Percent used GPS 
         */
        @MavlinkFieldInfo(
                position = 12,
                unitSize = 1
        )
        public final Builder percentused(int percentused) {
            this.percentused = percentused;
            return this;
        }

        public final GpsDateTime build() {
            return new GpsDateTime(year, month, day, hour, min, sec, clockstat, vissat, usesat, gppgl, sigusedmask, percentused);
        }
    }
}