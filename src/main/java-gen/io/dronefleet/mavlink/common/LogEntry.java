package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * Reply to {@link io.dronefleet.mavlink.common.LogRequestList LOG_REQUEST_LIST} 
 */
@MavlinkMessageInfo(
        id = 118,
        crc = 56
)
public final class LogEntry {
    private final int id;

    private final int numLogs;

    private final int lastLogNum;

    private final long timeUtc;

    private final long size;

    private LogEntry(int id, int numLogs, int lastLogNum, long timeUtc, long size) {
        this.id = id;
        this.numLogs = numLogs;
        this.lastLogNum = lastLogNum;
        this.timeUtc = timeUtc;
        this.size = size;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Log id 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 2
    )
    public final int id() {
        return this.id;
    }

    /**
     * Total number of logs 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 2
    )
    public final int numLogs() {
        return this.numLogs;
    }

    /**
     * High log number 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 2
    )
    public final int lastLogNum() {
        return this.lastLogNum;
    }

    /**
     * UTC timestamp of log in seconds since 1970, or 0 if not available 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4
    )
    public final long timeUtc() {
        return this.timeUtc;
    }

    /**
     * Size of the log (may be approximate) in bytes 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4
    )
    public final long size() {
        return this.size;
    }

    public static final class Builder {
        private int id;

        private int numLogs;

        private int lastLogNum;

        private long timeUtc;

        private long size;

        /**
         * Log id 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 2
        )
        public final Builder id(int id) {
            this.id = id;
            return this;
        }

        /**
         * Total number of logs 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 2
        )
        public final Builder numLogs(int numLogs) {
            this.numLogs = numLogs;
            return this;
        }

        /**
         * High log number 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 2
        )
        public final Builder lastLogNum(int lastLogNum) {
            this.lastLogNum = lastLogNum;
            return this;
        }

        /**
         * UTC timestamp of log in seconds since 1970, or 0 if not available 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4
        )
        public final Builder timeUtc(long timeUtc) {
            this.timeUtc = timeUtc;
            return this;
        }

        /**
         * Size of the log (may be approximate) in bytes 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4
        )
        public final Builder size(long size) {
            this.size = size;
            return this;
        }

        public final LogEntry build() {
            return new LogEntry(id, numLogs, lastLogNum, timeUtc, size);
        }
    }
}