package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Float;
import java.math.BigInteger;
import java.util.List;

/**
 * camera vision based attitude and position deltas 
 */
@MavlinkMessageInfo(
        id = 11011,
        crc = 106
)
public final class VisionPositionDelta {
    private final BigInteger timeUsec;

    private final BigInteger timeDeltaUsec;

    private final List<Float> angleDelta;

    private final List<Float> positionDelta;

    private final float confidence;

    private VisionPositionDelta(BigInteger timeUsec, BigInteger timeDeltaUsec,
            List<Float> angleDelta, List<Float> positionDelta, float confidence) {
        this.timeUsec = timeUsec;
        this.timeDeltaUsec = timeDeltaUsec;
        this.angleDelta = angleDelta;
        this.positionDelta = positionDelta;
        this.confidence = confidence;
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
     * Time in microseconds since the last reported camera frame 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 8
    )
    public final BigInteger timeDeltaUsec() {
        return this.timeDeltaUsec;
    }

    /**
     * Defines a rotation vector in body frame that rotates the vehicle from the previous to the 
     * current orientation 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4,
            arraySize = 3
    )
    public final List<Float> angleDelta() {
        return this.angleDelta;
    }

    /**
     * Change in position in meters from previous to current frame rotated into body frame 
     * (0=forward, 1=right, 2=down) 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4,
            arraySize = 3
    )
    public final List<Float> positionDelta() {
        return this.positionDelta;
    }

    /**
     * normalised confidence value from 0 to 100 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4
    )
    public final float confidence() {
        return this.confidence;
    }

    public static final class Builder {
        private BigInteger timeUsec;

        private BigInteger timeDeltaUsec;

        private List<Float> angleDelta;

        private List<Float> positionDelta;

        private float confidence;

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
         * Time in microseconds since the last reported camera frame 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 8
        )
        public final Builder timeDeltaUsec(BigInteger timeDeltaUsec) {
            this.timeDeltaUsec = timeDeltaUsec;
            return this;
        }

        /**
         * Defines a rotation vector in body frame that rotates the vehicle from the previous to the 
         * current orientation 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4,
                arraySize = 3
        )
        public final Builder angleDelta(List<Float> angleDelta) {
            this.angleDelta = angleDelta;
            return this;
        }

        /**
         * Change in position in meters from previous to current frame rotated into body frame 
         * (0=forward, 1=right, 2=down) 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4,
                arraySize = 3
        )
        public final Builder positionDelta(List<Float> positionDelta) {
            this.positionDelta = positionDelta;
            return this;
        }

        /**
         * normalised confidence value from 0 to 100 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4
        )
        public final Builder confidence(float confidence) {
            this.confidence = confidence;
            return this;
        }

        public final VisionPositionDelta build() {
            return new VisionPositionDelta(timeUsec, timeDeltaUsec, angleDelta, positionDelta, confidence);
        }
    }
}