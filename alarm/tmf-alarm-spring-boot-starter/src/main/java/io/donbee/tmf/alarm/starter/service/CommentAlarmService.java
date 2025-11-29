package io.donbee.tmf.alarm.starter.service;

import io.donbee.tmf.alarm.starter.controller.CommentAlarmApi;
import io.donbee.tmf.alarm.common.model.CommentAlarm;
import io.donbee.tmf.alarm.common.model.CommentAlarmFVO;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Service interface for CommentAlarm (Alarm Commenting) operations.
 * <p>
 * All methods have corresponding REST endpoints defined in
 * {@link io.donbee.tmf.alarm.starter.controller.CommentAlarmApi}.
 */
public interface CommentAlarmService {

    /**
     * Creates a new alarm comment.
     *
     * @param commentAlarmFVO the comment payload
     * @param fields          comma-separated list of fields to return (optional)
     * @return created CommentAlarm with HTTP 201
     * @see CommentAlarmApi#createCommentAlarm(CommentAlarmFVO, String)
     */
    ResponseEntity<CommentAlarm> createCommentAlarm(CommentAlarmFVO commentAlarmFVO, String fields);

    /**
     * Lists or searches alarm comments.
     *
     * @param fields comma-separated list of fields to return (optional)
     * @param offset requested index for start of page (optional)
     * @param limit  requested page size (optional)
     * @return list of CommentAlarm objects
     * @see CommentAlarmApi#listCommentAlarm(String, Integer, Integer)
     */
    ResponseEntity<List<CommentAlarm>> listCommentAlarm(String fields, Integer offset, Integer limit);

    /**
     * Retrieves a single alarm comment by its identifier.
     *
     * @param id     identifier of the comment
     * @param fields comma-separated list of fields to return (optional)
     * @return the CommentAlarm object
     * @see CommentAlarmApi#retrieveCommentAlarm(String, String)
     */
    ResponseEntity<CommentAlarm> retrieveCommentAlarm(String id, String fields);
}
