package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Float;
import java.math.BigInteger;
import java.util.List;

/**
 * Set the vehicle attitude and body angular rates. 
 */
@MavlinkMessageInfo(
        id = 140,
        crc = 181
)
public final class ActuatorControlTarget {
    private final BigInteger timeUsec;

    private final int groupMlx;

    private final List<Float> controls;

    private ActuatorControlTarget(BigInteger timeUsec, int groupMlx, List<Float> controls) {
        this.timeUsec = timeUsec;
        this.groupMlx = groupMlx;
        this.controls = controls;
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
     * Actuator group. The "_mlx" indicates this is a multi-instance message and a MAVLink parser 
     * should use this field to difference between instances. 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1
    )
    public final int groupMlx() {
        return this.groupMlx;
    }

    /**
     * Actuator controls. Normed to -1..+1 where 0 is neutral position. Throttle for single rotation 
     * direction motors is 0..1, negative range for reverse direction. Standard mapping for 
     * attitude controls (group 0): (index 0-7): roll, pitch, yaw, throttle, flaps, spoilers, 
     * airbrakes, landing gear. Load a pass-through mixer to repurpose them as generic outputs. 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4,
            arraySize = 8
    )
    public final List<Float> controls() {
        return this.controls;
    }

    public static final class Builder {
        private BigInteger timeUsec;

        private int groupMlx;

        private List<Float> controls;

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
         * Actuator group. The "_mlx" indicates this is a multi-instance message and a MAVLink parser 
         * should use this field to difference between instances. 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1
        )
        public final Builder groupMlx(int groupMlx) {
            this.groupMlx = groupMlx;
            return this;
        }

        /**
         * Actuator controls. Normed to -1..+1 where 0 is neutral position. Throttle for single rotation 
         * direction motors is 0..1, negative range for reverse direction. Standard mapping for 
         * attitude controls (group 0): (index 0-7): roll, pitch, yaw, throttle, flaps, spoilers, 
         * airbrakes, landing gear. Load a pass-through mixer to repurpose them as generic outputs. 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4,
                arraySize = 8
        )
        public final Builder controls(List<Float> controls) {
            this.controls = controls;
            return this;
        }

        public final ActuatorControlTarget build() {
            return new ActuatorControlTarget(timeUsec, groupMlx, controls);
        }
    }
}