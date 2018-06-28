package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Float;
import java.math.BigInteger;
import java.util.List;

/**
 * The smoothed, monotonic system state used to feed the control loops of the system. 
 */
@MavlinkMessageInfo(
        id = 146,
        crc = 103
)
public final class ControlSystemState {
    private final BigInteger timeUsec;

    private final float xAcc;

    private final float yAcc;

    private final float zAcc;

    private final float xVel;

    private final float yVel;

    private final float zVel;

    private final float xPos;

    private final float yPos;

    private final float zPos;

    private final float airspeed;

    private final List<Float> velVariance;

    private final List<Float> posVariance;

    private final List<Float> q;

    private final float rollRate;

    private final float pitchRate;

    private final float yawRate;

    private ControlSystemState(BigInteger timeUsec, float xAcc, float yAcc, float zAcc, float xVel,
            float yVel, float zVel, float xPos, float yPos, float zPos, float airspeed,
            List<Float> velVariance, List<Float> posVariance, List<Float> q, float rollRate,
            float pitchRate, float yawRate) {
        this.timeUsec = timeUsec;
        this.xAcc = xAcc;
        this.yAcc = yAcc;
        this.zAcc = zAcc;
        this.xVel = xVel;
        this.yVel = yVel;
        this.zVel = zVel;
        this.xPos = xPos;
        this.yPos = yPos;
        this.zPos = zPos;
        this.airspeed = airspeed;
        this.velVariance = velVariance;
        this.posVariance = posVariance;
        this.q = q;
        this.rollRate = rollRate;
        this.pitchRate = pitchRate;
        this.yawRate = yawRate;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Timestamp (micros since boot or Unix epoch) 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 8
    )
    public final BigInteger timeUsec() {
        return this.timeUsec;
    }

    /**
     * X acceleration in body frame 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 4
    )
    public final float xAcc() {
        return this.xAcc;
    }

    /**
     * Y acceleration in body frame 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4
    )
    public final float yAcc() {
        return this.yAcc;
    }

    /**
     * Z acceleration in body frame 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4
    )
    public final float zAcc() {
        return this.zAcc;
    }

    /**
     * X velocity in body frame 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4
    )
    public final float xVel() {
        return this.xVel;
    }

    /**
     * Y velocity in body frame 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 4
    )
    public final float yVel() {
        return this.yVel;
    }

    /**
     * Z velocity in body frame 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 4
    )
    public final float zVel() {
        return this.zVel;
    }

    /**
     * X position in local frame 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 4
    )
    public final float xPos() {
        return this.xPos;
    }

    /**
     * Y position in local frame 
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 4
    )
    public final float yPos() {
        return this.yPos;
    }

    /**
     * Z position in local frame 
     */
    @MavlinkFieldInfo(
            position = 10,
            unitSize = 4
    )
    public final float zPos() {
        return this.zPos;
    }

    /**
     * Airspeed, set to -1 if unknown 
     */
    @MavlinkFieldInfo(
            position = 11,
            unitSize = 4
    )
    public final float airspeed() {
        return this.airspeed;
    }

    /**
     * Variance of body velocity estimate 
     */
    @MavlinkFieldInfo(
            position = 12,
            unitSize = 4,
            arraySize = 3
    )
    public final List<Float> velVariance() {
        return this.velVariance;
    }

    /**
     * Variance in local position 
     */
    @MavlinkFieldInfo(
            position = 13,
            unitSize = 4,
            arraySize = 3
    )
    public final List<Float> posVariance() {
        return this.posVariance;
    }

    /**
     * The attitude, represented as Quaternion 
     */
    @MavlinkFieldInfo(
            position = 14,
            unitSize = 4,
            arraySize = 4
    )
    public final List<Float> q() {
        return this.q;
    }

    /**
     * Angular rate in roll axis 
     */
    @MavlinkFieldInfo(
            position = 15,
            unitSize = 4
    )
    public final float rollRate() {
        return this.rollRate;
    }

    /**
     * Angular rate in pitch axis 
     */
    @MavlinkFieldInfo(
            position = 16,
            unitSize = 4
    )
    public final float pitchRate() {
        return this.pitchRate;
    }

    /**
     * Angular rate in yaw axis 
     */
    @MavlinkFieldInfo(
            position = 17,
            unitSize = 4
    )
    public final float yawRate() {
        return this.yawRate;
    }

    public static final class Builder {
        private BigInteger timeUsec;

        private float xAcc;

        private float yAcc;

        private float zAcc;

        private float xVel;

        private float yVel;

        private float zVel;

        private float xPos;

        private float yPos;

        private float zPos;

        private float airspeed;

        private List<Float> velVariance;

        private List<Float> posVariance;

        private List<Float> q;

        private float rollRate;

        private float pitchRate;

        private float yawRate;

        /**
         * Timestamp (micros since boot or Unix epoch) 
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
         * X acceleration in body frame 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 4
        )
        public final Builder xAcc(float xAcc) {
            this.xAcc = xAcc;
            return this;
        }

        /**
         * Y acceleration in body frame 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4
        )
        public final Builder yAcc(float yAcc) {
            this.yAcc = yAcc;
            return this;
        }

        /**
         * Z acceleration in body frame 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4
        )
        public final Builder zAcc(float zAcc) {
            this.zAcc = zAcc;
            return this;
        }

        /**
         * X velocity in body frame 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4
        )
        public final Builder xVel(float xVel) {
            this.xVel = xVel;
            return this;
        }

        /**
         * Y velocity in body frame 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 4
        )
        public final Builder yVel(float yVel) {
            this.yVel = yVel;
            return this;
        }

        /**
         * Z velocity in body frame 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 4
        )
        public final Builder zVel(float zVel) {
            this.zVel = zVel;
            return this;
        }

        /**
         * X position in local frame 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 4
        )
        public final Builder xPos(float xPos) {
            this.xPos = xPos;
            return this;
        }

        /**
         * Y position in local frame 
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 4
        )
        public final Builder yPos(float yPos) {
            this.yPos = yPos;
            return this;
        }

        /**
         * Z position in local frame 
         */
        @MavlinkFieldInfo(
                position = 10,
                unitSize = 4
        )
        public final Builder zPos(float zPos) {
            this.zPos = zPos;
            return this;
        }

        /**
         * Airspeed, set to -1 if unknown 
         */
        @MavlinkFieldInfo(
                position = 11,
                unitSize = 4
        )
        public final Builder airspeed(float airspeed) {
            this.airspeed = airspeed;
            return this;
        }

        /**
         * Variance of body velocity estimate 
         */
        @MavlinkFieldInfo(
                position = 12,
                unitSize = 4,
                arraySize = 3
        )
        public final Builder velVariance(List<Float> velVariance) {
            this.velVariance = velVariance;
            return this;
        }

        /**
         * Variance in local position 
         */
        @MavlinkFieldInfo(
                position = 13,
                unitSize = 4,
                arraySize = 3
        )
        public final Builder posVariance(List<Float> posVariance) {
            this.posVariance = posVariance;
            return this;
        }

        /**
         * The attitude, represented as Quaternion 
         */
        @MavlinkFieldInfo(
                position = 14,
                unitSize = 4,
                arraySize = 4
        )
        public final Builder q(List<Float> q) {
            this.q = q;
            return this;
        }

        /**
         * Angular rate in roll axis 
         */
        @MavlinkFieldInfo(
                position = 15,
                unitSize = 4
        )
        public final Builder rollRate(float rollRate) {
            this.rollRate = rollRate;
            return this;
        }

        /**
         * Angular rate in pitch axis 
         */
        @MavlinkFieldInfo(
                position = 16,
                unitSize = 4
        )
        public final Builder pitchRate(float pitchRate) {
            this.pitchRate = pitchRate;
            return this;
        }

        /**
         * Angular rate in yaw axis 
         */
        @MavlinkFieldInfo(
                position = 17,
                unitSize = 4
        )
        public final Builder yawRate(float yawRate) {
            this.yawRate = yawRate;
            return this;
        }

        public final ControlSystemState build() {
            return new ControlSystemState(timeUsec, xAcc, yAcc, zAcc, xVel, yVel, zVel, xPos, yPos, zPos, airspeed, velVariance, posVariance, q, rollRate, pitchRate, yawRate);
        }
    }
}