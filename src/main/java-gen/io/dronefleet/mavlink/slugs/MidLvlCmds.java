package io.dronefleet.mavlink.slugs;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * Mid Level commands sent from the GS to the autopilot. These are only sent when being operated in 
 * mid-level commands mode from the ground. 
 */
@MavlinkMessageInfo(
        id = 180,
        crc = 146
)
public final class MidLvlCmds {
    private final int target;

    private final float hcommand;

    private final float ucommand;

    private final float rcommand;

    private MidLvlCmds(int target, float hcommand, float ucommand, float rcommand) {
        this.target = target;
        this.hcommand = hcommand;
        this.ucommand = ucommand;
        this.rcommand = rcommand;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The system setting the commands 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1
    )
    public final int target() {
        return this.target;
    }

    /**
     * Commanded Altitude 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 4
    )
    public final float hcommand() {
        return this.hcommand;
    }

    /**
     * Commanded Airspeed 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4
    )
    public final float ucommand() {
        return this.ucommand;
    }

    /**
     * Commanded Turnrate 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4
    )
    public final float rcommand() {
        return this.rcommand;
    }

    public static final class Builder {
        private int target;

        private float hcommand;

        private float ucommand;

        private float rcommand;

        /**
         * The system setting the commands 
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
         * Commanded Altitude 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 4
        )
        public final Builder hcommand(float hcommand) {
            this.hcommand = hcommand;
            return this;
        }

        /**
         * Commanded Airspeed 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4
        )
        public final Builder ucommand(float ucommand) {
            this.ucommand = ucommand;
            return this;
        }

        /**
         * Commanded Turnrate 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4
        )
        public final Builder rcommand(float rcommand) {
            this.rcommand = rcommand;
            return this;
        }

        public final MidLvlCmds build() {
            return new MidLvlCmds(target, hcommand, ucommand, rcommand);
        }
    }
}