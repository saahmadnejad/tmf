package io.donbee.tmf.alarm.starter.service;

import io.donbee.tmf.alarm.common.model.*;
import org.springframework.http.ResponseEntity;

/**
 * Service interface for handling TM Forum Alarm Management notification listener events.
 * <p>
 * These methods are called when external systems send notification events to the listener endpoints
 * defined in {@link io.donbee.tmf.alarm.starter.controller.ListenerApi}.
 * <p>
 * All methods return ResponseEntity<Void> with status 204 (No Content) on successful processing.
 */
public interface ListenerService {

    /**
     * Handles AckAlarmCreateEvent notification.
     *
     * @param ackAlarmCreateEvent the event payload
     * @return 204 No Content on success
     * @see io.donbee.tmf.alarm.starter.controller.ListenerApi#ackAlarmCreateEvent(AckAlarmCreateEvent)
     */
    ResponseEntity<Void> ackAlarmCreateEvent(AckAlarmCreateEvent ackAlarmCreateEvent);

    /**
     * Handles AckAlarmStateChangeEvent notification.
     *
     * @param ackAlarmStateChangeEvent the event payload
     * @return 204 No Content on success
     * @see io.donbee.tmf.alarm.starter.controller.ListenerApi#ackAlarmStateChangeEvent(AckAlarmStateChangeEvent)
     */
    ResponseEntity<Void> ackAlarmStateChangeEvent(AckAlarmStateChangeEvent ackAlarmStateChangeEvent);

    /**
     * Handles AlarmAttributeValueChangeEvent notification.
     *
     * @param alarmAttributeValueChangeEvent the event payload
     * @return 204 No Content on success
     * @see io.donbee.tmf.alarm.starter.controller.ListenerApi#alarmAttributeValueChangeEvent(AlarmAttributeValueChangeEvent)
     */
    ResponseEntity<Void> alarmAttributeValueChangeEvent(AlarmAttributeValueChangeEvent alarmAttributeValueChangeEvent);

    /**
     * Handles AlarmCreateEvent notification.
     *
     * @param alarmCreateEvent the event payload
     * @return 204 No Content on success
     * @see io.donbee.tmf.alarm.starter.controller.ListenerApi#alarmCreateEvent(AlarmCreateEvent)
     */
    ResponseEntity<Void> alarmCreateEvent(AlarmCreateEvent alarmCreateEvent);

    /**
     * Handles AlarmDeleteEvent notification.
     *
     * @param alarmDeleteEvent the event payload
     * @return 204 No Content on success
     * @see io.donbee.tmf.alarm.starter.controller.ListenerApi#alarmDeleteEvent(AlarmDeleteEvent)
     */
    ResponseEntity<Void> alarmDeleteEvent(AlarmDeleteEvent alarmDeleteEvent);

    /**
     * Handles AlarmStateChangeEvent notification.
     *
     * @param alarmStateChangeEvent the event payload
     * @return 204 No Content on success
     * @see io.donbee.tmf.alarm.starter.controller.ListenerApi#alarmStateChangeEvent(AlarmStateChangeEvent)
     */
    ResponseEntity<Void> alarmStateChangeEvent(AlarmStateChangeEvent alarmStateChangeEvent);

    /**
     * Handles ClearAlarmCreateEvent notification.
     *
     * @param clearAlarmCreateEvent the event payload
     * @return 204 No Content on success
     * @see io.donbee.tmf.alarm.starter.controller.ListenerApi#clearAlarmCreateEvent(ClearAlarmCreateEvent)
     */
    ResponseEntity<Void> clearAlarmCreateEvent(ClearAlarmCreateEvent clearAlarmCreateEvent);

    /**
     * Handles ClearAlarmStateChangeEvent notification.
     *
     * @param clearAlarmStateChangeEvent the event payload
     * @return 204 No Content on success
     * @see io.donbee.tmf.alarm.starter.controller.ListenerApi#clearAlarmStateChangeEvent(ClearAlarmStateChangeEvent)
     */
    ResponseEntity<Void> clearAlarmStateChangeEvent(ClearAlarmStateChangeEvent clearAlarmStateChangeEvent);

    /**
     * Handles CommentAlarmCreateEvent notification.
     *
     * @param commentAlarmCreateEvent the event payload
     * @return 204 No Content on success
     * @see io.donbee.tmf.alarm.starter.controller.ListenerApi#commentAlarmCreateEvent(CommentAlarmCreateEvent)
     */
    ResponseEntity<Void> commentAlarmCreateEvent(CommentAlarmCreateEvent commentAlarmCreateEvent);

    /**
     * Handles CommentAlarmStateChangeEvent notification.
     *
     * @param commentAlarmStateChangeEvent the event payload
     * @return 204 No Content on success
     * @see io.donbee.tmf.alarm.starter.controller.ListenerApi#commentAlarmStateChangeEvent(CommentAlarmStateChangeEvent)
     */
    ResponseEntity<Void> commentAlarmStateChangeEvent(CommentAlarmStateChangeEvent commentAlarmStateChangeEvent);

    /**
     * Handles GroupAlarmCreateEvent notification.
     *
     * @param groupAlarmCreateEvent the event payload
     * @return 204 No Content on success
     * @see io.donbee.tmf.alarm.starter.controller.ListenerApi#groupAlarmCreateEvent(GroupAlarmCreateEvent)
     */
    ResponseEntity<Void> groupAlarmCreateEvent(GroupAlarmCreateEvent groupAlarmCreateEvent);

    /**
     * Handles GroupAlarmStateChangeEvent notification.
     *
     * @param groupAlarmStateChangeEvent the event payload
     * @return 204 No Content on success
     * @see io.donbee.tmf.alarm.starter.controller.ListenerApi#groupAlarmStateChangeEvent(GroupAlarmStateChangeEvent)
     */
    ResponseEntity<Void> groupAlarmStateChangeEvent(GroupAlarmStateChangeEvent groupAlarmStateChangeEvent);

    /**
     * Handles UnAckAlarmCreateEvent notification.
     *
     * @param unAckAlarmCreateEvent the event payload
     * @return 204 No Content on success
     * @see io.donbee.tmf.alarm.starter.controller.ListenerApi#unAckAlarmCreateEvent(UnAckAlarmCreateEvent)
     */
    ResponseEntity<Void> unAckAlarmCreateEvent(UnAckAlarmCreateEvent unAckAlarmCreateEvent);

    /**
     * Handles UnAckAlarmStateChangeEvent notification.
     *
     * @param unAckAlarmStateChangeEvent the event payload
     * @return 204 No Content on success
     * @see io.donbee.tmf.alarm.starter.controller.ListenerApi#unAckAlarmStateChangeEvent(UnAckAlarmStateChangeEvent)
     */
    ResponseEntity<Void> unAckAlarmStateChangeEvent(UnAckAlarmStateChangeEvent unAckAlarmStateChangeEvent);

    /**
     * Handles UnGroupAlarmCreateEvent notification.
     *
     * @param unGroupAlarmCreateEvent the event payload
     * @return 204 No Content on success
     * @see io.donbee.tmf.alarm.starter.controller.ListenerApi#unGroupAlarmCreateEvent(UnGroupAlarmCreateEvent)
     */
    ResponseEntity<Void> unGroupAlarmCreateEvent(UnGroupAlarmCreateEvent unGroupAlarmCreateEvent);

    /**
     * Handles UnGroupAlarmStateChangeEvent notification.
     *
     * @param unGroupAlarmStateChangeEvent the event payload
     * @return 204 No Content on success
     * @see io.donbee.tmf.alarm.starter.controller.ListenerApi#unGroupAlarmStateChangeEvent(UnGroupAlarmStateChangeEvent)
     */
    ResponseEntity<Void> unGroupAlarmStateChangeEvent(UnGroupAlarmStateChangeEvent unGroupAlarmStateChangeEvent);
}
