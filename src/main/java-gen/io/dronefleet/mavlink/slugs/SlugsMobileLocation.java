package io.dronefleet.mavlink.slugs;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * Transmits the last known position of the mobile GS to the UAV. Very relevant when Track Mobile is 
 * enabled 
 */
@MavlinkMessageInfo(
        id = 186,
        crc = 101
)
public final class SlugsMobileLocation {
    private final int target;

    private final float latitude;

    private final float longitude;

    private SlugsMobileLocation(int target, float latitude, float longitude) {
        this.target = target;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The system reporting the action 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1
    )
    public final int target() {
        return this.target;
    }

    /**
     * Mobile Latitude 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 4
    )
    public final float latitude() {
        return this.latitude;
    }

    /**
     * Mobile Longitude 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4
    )
    public final float longitude() {
        return this.longitude;
    }

    public static final class Builder {
        private int target;

        private float latitude;

        private float longitude;

        /**
         * The system reporting the action 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1
        )
        public final Builder target(int target) {
            this.target = target;
            return this;
        }

        /**
         * Mobile Latitude 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 4
        )
        public final Builder latitude(float latitude) {
            this.latitude = latitude;
            return this;
        }

        /**
         * Mobile Longitude 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4
        )
        public final Builder longitude(float longitude) {
            this.longitude = longitude;
            return this;
        }

        public final SlugsMobileLocation build() {
            return new SlugsMobileLocation(target, latitude, longitude);
        }
    }
}