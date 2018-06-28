package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.math.BigInteger;

/**
 * Camera Capture Feedback 
 */
@MavlinkMessageInfo(
        id = 180,
        crc = 107
)
public final class CameraFeedback {
    private final BigInteger timeUsec;

    private final int targetSystem;

    private final int camIdx;

    private final int imgIdx;

    private final int lat;

    private final int lng;

    private final float altMsl;

    private final float altRel;

    private final float roll;

    private final float pitch;

    private final float yaw;

    private final float focLen;

    private final CameraFeedbackFlags flags;

    private final int completedCaptures;

    private CameraFeedback(BigInteger timeUsec, int targetSystem, int camIdx, int imgIdx, int lat,
            int lng, float altMsl, float altRel, float roll, float pitch, float yaw, float focLen,
            CameraFeedbackFlags flags, int completedCaptures) {
        this.timeUsec = timeUsec;
        this.targetSystem = targetSystem;
        this.camIdx = camIdx;
        this.imgIdx = imgIdx;
        this.lat = lat;
        this.lng = lng;
        this.altMsl = altMsl;
        this.altRel = altRel;
        this.roll = roll;
        this.pitch = pitch;
        this.yaw = yaw;
        this.focLen = focLen;
        this.flags = flags;
        this.completedCaptures = completedCaptures;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Image timestamp (microseconds since UNIX epoch), as passed in by {@link io.dronefleet.mavlink.ardupilotmega.CameraStatus CAMERA_STATUS} message (or 
     * autopilot if no CCB) 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 8
    )
    public final BigInteger timeUsec() {
        return this.timeUsec;
    }

    /**
     * System ID 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1
    )
    public final int targetSystem() {
        return this.targetSystem;
    }

    /**
     * Camera ID 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1
    )
    public final int camIdx() {
        return this.camIdx;
    }

    /**
     * Image index 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 2
    )
    public final int imgIdx() {
        return this.imgIdx;
    }

    /**
     * Latitude in (deg * 1E7) 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4,
            signed = true
    )
    public final int lat() {
        return this.lat;
    }

    /**
     * Longitude in (deg * 1E7) 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 4,
            signed = true
    )
    public final int lng() {
        return this.lng;
    }

    /**
     * Altitude Absolute (meters AMSL) 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 4
    )
    public final float altMsl() {
        return this.altMsl;
    }

    /**
     * Altitude Relative (meters above HOME location) 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 4
    )
    public final float altRel() {
        return this.altRel;
    }

    /**
     * Camera Roll angle (earth frame, degrees, +-180) 
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 4
    )
    public final float roll() {
        return this.roll;
    }

    /**
     * Camera Pitch angle (earth frame, degrees, +-180) 
     */
    @MavlinkFieldInfo(
            position = 10,
            unitSize = 4
    )
    public final float pitch() {
        return this.pitch;
    }

    /**
     * Camera Yaw (earth frame, degrees, 0-360, true) 
     */
    @MavlinkFieldInfo(
            position = 11,
            unitSize = 4
    )
    public final float yaw() {
        return this.yaw;
    }

    /**
     * Focal Length (mm) 
     */
    @MavlinkFieldInfo(
            position = 12,
            unitSize = 4
    )
    public final float focLen() {
        return this.focLen;
    }

    /**
     * See {@link io.dronefleet.mavlink.ardupilotmega.CameraFeedbackFlags CAMERA_FEEDBACK_FLAGS} enum for definition of the bitmask 
     */
    @MavlinkFieldInfo(
            position = 13,
            unitSize = 1
    )
    public final CameraFeedbackFlags flags() {
        return this.flags;
    }

    /**
     * Completed image captures 
     */
    @MavlinkFieldInfo(
            position = 15,
            unitSize = 2,
            extension = true
    )
    public final int completedCaptures() {
        return this.completedCaptures;
    }

    public static final class Builder {
        private BigInteger timeUsec;

        private int targetSystem;

        private int camIdx;

        private int imgIdx;

        private int lat;

        private int lng;

        private float altMsl;

        private float altRel;

        private float roll;

        private float pitch;

        private float yaw;

        private float focLen;

        private CameraFeedbackFlags flags;

        private int completedCaptures;

        /**
         * Image timestamp (microseconds since UNIX epoch), as passed in by {@link io.dronefleet.mavlink.ardupilotmega.CameraStatus CAMERA_STATUS} message (or 
         * autopilot if no CCB) 
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
         * System ID 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1
        )
        public final Builder targetSystem(int targetSystem) {
            this.targetSystem = targetSystem;
            return this;
        }

        /**
         * Camera ID 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1
        )
        public final Builder camIdx(int camIdx) {
            this.camIdx = camIdx;
            return this;
        }

        /**
         * Image index 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 2
        )
        public final Builder imgIdx(int imgIdx) {
            this.imgIdx = imgIdx;
            return this;
        }

        /**
         * Latitude in (deg * 1E7) 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4,
                signed = true
        )
        public final Builder lat(int lat) {
            this.lat = lat;
            return this;
        }

        /**
         * Longitude in (deg * 1E7) 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 4,
                signed = true
        )
        public final Builder lng(int lng) {
            this.lng = lng;
            return this;
        }

        /**
         * Altitude Absolute (meters AMSL) 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 4
        )
        public final Builder altMsl(float altMsl) {
            this.altMsl = altMsl;
            return this;
        }

        /**
         * Altitude Relative (meters above HOME location) 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 4
        )
        public final Builder altRel(float altRel) {
            this.altRel = altRel;
            return this;
        }

        /**
         * Camera Roll angle (earth frame, degrees, +-180) 
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 4
        )
        public final Builder roll(float roll) {
            this.roll = roll;
            return this;
        }

        /**
         * Camera Pitch angle (earth frame, degrees, +-180) 
         */
        @MavlinkFieldInfo(
                position = 10,
                unitSize = 4
        )
        public final Builder pitch(float pitch) {
            this.pitch = pitch;
            return this;
        }

        /**
         * Camera Yaw (earth frame, degrees, 0-360, true) 
         */
        @MavlinkFieldInfo(
                position = 11,
                unitSize = 4
        )
        public final Builder yaw(float yaw) {
            this.yaw = yaw;
            return this;
        }

        /**
         * Focal Length (mm) 
         */
        @MavlinkFieldInfo(
                position = 12,
                unitSize = 4
        )
        public final Builder focLen(float focLen) {
            this.focLen = focLen;
            return this;
        }

        /**
         * See {@link io.dronefleet.mavlink.ardupilotmega.CameraFeedbackFlags CAMERA_FEEDBACK_FLAGS} enum for definition of the bitmask 
         */
        @MavlinkFieldInfo(
                position = 13,
                unitSize = 1
        )
        public final Builder flags(CameraFeedbackFlags flags) {
            this.flags = flags;
            return this;
        }

        /**
         * Completed image captures 
         */
        @MavlinkFieldInfo(
                position = 15,
                unitSize = 2,
                extension = true
        )
        public final Builder completedCaptures(int completedCaptures) {
            this.completedCaptures = completedCaptures;
            return this;
        }

        public final CameraFeedback build() {
            return new CameraFeedback(timeUsec, targetSystem, camIdx, imgIdx, lat, lng, altMsl, altRel, roll, pitch, yaw, focLen, flags, completedCaptures);
        }
    }
}