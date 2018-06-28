package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * Deprecated. Use MAV_CMD_PREFLIGHT_SET_SENSOR_OFFSETS instead. Set the magnetometer 
 * offsets 
 */
@MavlinkMessageInfo(
        id = 151,
        crc = 219
)
public final class SetMagOffsets {
    private final int targetSystem;

    private final int targetComponent;

    private final int magOfsX;

    private final int magOfsY;

    private final int magOfsZ;

    private SetMagOffsets(int targetSystem, int targetComponent, int magOfsX, int magOfsY,
            int magOfsZ) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.magOfsX = magOfsX;
        this.magOfsY = magOfsY;
        this.magOfsZ = magOfsZ;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * System ID 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1
    )
    public final int targetSystem() {
        return this.targetSystem;
    }

    /**
     * Component ID 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1
    )
    public final int targetComponent() {
        return this.targetComponent;
    }

    /**
     * magnetometer X offset 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 2,
            signed = true
    )
    public final int magOfsX() {
        return this.magOfsX;
    }

    /**
     * magnetometer Y offset 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 2,
            signed = true
    )
    public final int magOfsY() {
        return this.magOfsY;
    }

    /**
     * magnetometer Z offset 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 2,
            signed = true
    )
    public final int magOfsZ() {
        return this.magOfsZ;
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int magOfsX;

        private int magOfsY;

        private int magOfsZ;

        /**
         * System ID 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1
        )
        public final Builder targetSystem(int targetSystem) {
            this.targetSystem = targetSystem;
            return this;
        }

        /**
         * Component ID 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1
        )
        public final Builder targetComponent(int targetComponent) {
            this.targetComponent = targetComponent;
            return this;
        }

        /**
         * magnetometer X offset 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 2,
                signed = true
        )
        public final Builder magOfsX(int magOfsX) {
            this.magOfsX = magOfsX;
            return this;
        }

        /**
         * magnetometer Y offset 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 2,
                signed = true
        )
        public final Builder magOfsY(int magOfsY) {
            this.magOfsY = magOfsY;
            return this;
        }

        /**
         * magnetometer Z offset 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 2,
                signed = true
        )
        public final Builder magOfsZ(int magOfsZ) {
            this.magOfsZ = magOfsZ;
            return this;
        }

        public final SetMagOffsets build() {
            return new SetMagOffsets(targetSystem, targetComponent, magOfsX, magOfsY, magOfsZ);
        }
    }
}