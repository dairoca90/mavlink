package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * Orientation of a mount 
 */
@MavlinkMessageInfo(
        id = 265,
        crc = 77
)
public final class MountOrientation {
    private final long timeBootMs;

    private final float roll;

    private final float pitch;

    private final float yaw;

    private final float yawAbsolute;

    private MountOrientation(long timeBootMs, float roll, float pitch, float yaw,
            float yawAbsolute) {
        this.timeBootMs = timeBootMs;
        this.roll = roll;
        this.pitch = pitch;
        this.yaw = yaw;
        this.yawAbsolute = yawAbsolute;
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
     * Roll in global frame in degrees (set to NaN for invalid). 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 4
    )
    public final float roll() {
        return this.roll;
    }

    /**
     * Pitch in global frame in degrees (set to NaN for invalid). 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4
    )
    public final float pitch() {
        return this.pitch;
    }

    /**
     * Yaw relative to vehicle in degrees (set to NaN for invalid). 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4
    )
    public final float yaw() {
        return this.yaw;
    }

    /**
     * Yaw in absolute frame in degrees, North is 0 (set to NaN for invalid). 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 4,
            extension = true
    )
    public final float yawAbsolute() {
        return this.yawAbsolute;
    }

    public static final class Builder {
        private long timeBootMs;

        private float roll;

        private float pitch;

        private float yaw;

        private float yawAbsolute;

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
         * Roll in global frame in degrees (set to NaN for invalid). 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 4
        )
        public final Builder roll(float roll) {
            this.roll = roll;
            return this;
        }

        /**
         * Pitch in global frame in degrees (set to NaN for invalid). 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4
        )
        public final Builder pitch(float pitch) {
            this.pitch = pitch;
            return this;
        }

        /**
         * Yaw relative to vehicle in degrees (set to NaN for invalid). 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4
        )
        public final Builder yaw(float yaw) {
            this.yaw = yaw;
            return this;
        }

        /**
         * Yaw in absolute frame in degrees, North is 0 (set to NaN for invalid). 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 4,
                extension = true
        )
        public final Builder yawAbsolute(float yawAbsolute) {
            this.yawAbsolute = yawAbsolute;
            return this;
        }

        public final MountOrientation build() {
            return new MountOrientation(timeBootMs, roll, pitch, yaw, yawAbsolute);
        }
    }
}