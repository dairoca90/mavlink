package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * The state of the fixed wing navigation and position controller. 
 */
@MavlinkMessageInfo(
        id = 62,
        crc = 183
)
public final class NavControllerOutput {
    private final float navRoll;

    private final float navPitch;

    private final int navBearing;

    private final int targetBearing;

    private final int wpDist;

    private final float altError;

    private final float aspdError;

    private final float xtrackError;

    private NavControllerOutput(float navRoll, float navPitch, int navBearing, int targetBearing,
            int wpDist, float altError, float aspdError, float xtrackError) {
        this.navRoll = navRoll;
        this.navPitch = navPitch;
        this.navBearing = navBearing;
        this.targetBearing = targetBearing;
        this.wpDist = wpDist;
        this.altError = altError;
        this.aspdError = aspdError;
        this.xtrackError = xtrackError;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Current desired roll in degrees 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 4
    )
    public final float navRoll() {
        return this.navRoll;
    }

    /**
     * Current desired pitch in degrees 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 4
    )
    public final float navPitch() {
        return this.navPitch;
    }

    /**
     * Current desired heading in degrees 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 2,
            signed = true
    )
    public final int navBearing() {
        return this.navBearing;
    }

    /**
     * Bearing to current waypoint/target in degrees 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 2,
            signed = true
    )
    public final int targetBearing() {
        return this.targetBearing;
    }

    /**
     * Distance to active waypoint in meters 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 2
    )
    public final int wpDist() {
        return this.wpDist;
    }

    /**
     * Current altitude error in meters 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 4
    )
    public final float altError() {
        return this.altError;
    }

    /**
     * Current airspeed error in meters/second 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 4
    )
    public final float aspdError() {
        return this.aspdError;
    }

    /**
     * Current crosstrack error on x-y plane in meters 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 4
    )
    public final float xtrackError() {
        return this.xtrackError;
    }

    public static final class Builder {
        private float navRoll;

        private float navPitch;

        private int navBearing;

        private int targetBearing;

        private int wpDist;

        private float altError;

        private float aspdError;

        private float xtrackError;

        /**
         * Current desired roll in degrees 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 4
        )
        public final Builder navRoll(float navRoll) {
            this.navRoll = navRoll;
            return this;
        }

        /**
         * Current desired pitch in degrees 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 4
        )
        public final Builder navPitch(float navPitch) {
            this.navPitch = navPitch;
            return this;
        }

        /**
         * Current desired heading in degrees 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 2,
                signed = true
        )
        public final Builder navBearing(int navBearing) {
            this.navBearing = navBearing;
            return this;
        }

        /**
         * Bearing to current waypoint/target in degrees 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 2,
                signed = true
        )
        public final Builder targetBearing(int targetBearing) {
            this.targetBearing = targetBearing;
            return this;
        }

        /**
         * Distance to active waypoint in meters 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 2
        )
        public final Builder wpDist(int wpDist) {
            this.wpDist = wpDist;
            return this;
        }

        /**
         * Current altitude error in meters 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 4
        )
        public final Builder altError(float altError) {
            this.altError = altError;
            return this;
        }

        /**
         * Current airspeed error in meters/second 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 4
        )
        public final Builder aspdError(float aspdError) {
            this.aspdError = aspdError;
            return this;
        }

        /**
         * Current crosstrack error on x-y plane in meters 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 4
        )
        public final Builder xtrackError(float xtrackError) {
            this.xtrackError = xtrackError;
            return this;
        }

        public final NavControllerOutput build() {
            return new NavControllerOutput(navRoll, navPitch, navBearing, targetBearing, wpDist, altError, aspdError, xtrackError);
        }
    }
}