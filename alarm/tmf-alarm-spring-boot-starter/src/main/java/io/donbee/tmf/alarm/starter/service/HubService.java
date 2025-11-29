package io.donbee.tmf.alarm.starter.service;

import io.donbee.tmf.alarm.common.model.Hub;
import io.donbee.tmf.alarm.common.model.HubFVO;
import org.springframework.http.ResponseEntity;

public interface HubService {

    /**
     * Creates a new event subscription (hub).
     * <p>
     * This registers a callback URL where the system will send alarm-related events.
     *
     * @param hubFVO the subscription payload containing callback URL and optional query
     * @return created Hub resource with HTTP 201 (Created) and location header
     * @see io.donbee.tmf.alarm.starter.controller.HubApi#createHub(HubFVO)
     */
    ResponseEntity<Hub> createHub(HubFVO hubFVO);

    /**
     * Deletes (unregisters) an existing event subscription.
     *
     * @param id the unique identifier of the hub/subscription to delete
     * @return HTTP 204 No Content on success
     * @see io.donbee.tmf.alarm.starter.controller.HubApi#hubDelete(String)
     */
    ResponseEntity<Void> deleteHub(String id);

    /**
     * Retrieves an existing event subscription by its ID.
     *
     * @param id the unique identifier of the hub/subscription
     * @return the Hub resource if found (HTTP 200), or appropriate error
     * @see io.donbee.tmf.alarm.starter.controller.HubApi#hubGet(String)
     */
    ResponseEntity<Hub> getHub(String id);
}
