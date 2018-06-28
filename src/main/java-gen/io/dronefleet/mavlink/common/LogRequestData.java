package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * Request a chunk of a log 
 */
@MavlinkMessageInfo(
        id = 119,
        crc = 116
)
public final class LogRequestData {
    private final int targetSystem;

    private final int targetComponent;

    private final int id;

    private final long ofs;

    private final long count;

    private LogRequestData(int targetSystem, int targetComponent, int id, long ofs, long count) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.id = id;
        this.ofs = ofs;
        this.count = count;
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
     * Log id (from {@link io.dronefleet.mavlink.common.LogEntry LOG_ENTRY} reply) 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 2
    )
    public final int id() {
        return this.id;
    }

    /**
     * Offset into the log 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4
    )
    public final long ofs() {
        return this.ofs;
    }

    /**
     * Number of bytes 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4
    )
    public final long count() {
        return this.count;
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int id;

        private long ofs;

        private long count;

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
         * Log id (from {@link io.dronefleet.mavlink.common.LogEntry LOG_ENTRY} reply) 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 2
        )
        public final Builder id(int id) {
            this.id = id;
            return this;
        }

        /**
         * Offset into the log 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4
        )
        public final Builder ofs(long ofs) {
            this.ofs = ofs;
            return this;
        }

        /**
         * Number of bytes 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4
        )
        public final Builder count(long count) {
            this.count = count;
            return this;
        }

        public final LogRequestData build() {
            return new LogRequestData(targetSystem, targetComponent, id, ofs, count);
        }
    }
}