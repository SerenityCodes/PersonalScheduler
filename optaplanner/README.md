# Optaplanner Service

## Rest API (docs inspired by [this gist](https://gist.github.com/azagniotov/a4b16faf0febd12efbc6c3d7370383a6))

## Common Objects

<details>
    <summary>Event Object</summary>  

```javascript
{
    id: uuid
    name: string
    startDate: datetime
    endDate: datetime
    allDay: boolean
    description: string
    isAvailable: enum ("busy", "available") 
}
```

</details>

### Get All User Events

<details>
 <summary><code>GET</code> <code><b>/events/get/{max_events}</b></code> <code>Gets all user events</code></summary>

#### Parameters

>
> | name              |  type     | data type      | description                         |
> |-------------------|-----------|----------------|-------------------------------------|
> | `max_events` |  requred | int ($int64)   | The maximum number of events that can be retrieved at one time        |

##### Responses

> | http code     | content-type                      | response                                                            |
> |---------------|-----------------------------------|---------------------------------------------------------------------|
> | `200`         | `application/json`        | {events: [{event objects}]}                     |
> | `400`         | `application/json`        | {"code": 400, "reason": error_string}           |
> | `500`         | `application/json`        | {"code": 500, "reason": server_error_string}    |

</details>

### Add events to Calendar

<details>
 <summary><code>POST</code> <code><b>/events/add/</b></code> <code>Add event/events to the calendar</code></summary>

#### Request Object

```javascript
{
    events: [{event objects}]
}
```

#### Parameters

> | name      |  type     | data type               | description                                                           |
> |-----------|-----------|-------------------------|-----------------------------------------------------------------------|
> | none      |  required | object (json or yaml)   | n/a  |


#### Responses

> | http code     | content-type                      | response                                                            |
> |---------------|-----------------------------------|---------------------------------------------------------------------|
> | `200`         | `text/plain;charset=utf-8`        | `events added succesfully!`                                |
> | `400`         | `text/plain;charset=utf-8`                | error_string                            |
> | `500`         | `text/plain;charset=utf-8`         | error_string                                                                |

</details>

### Remove Events from Calendar

<details>
    <summary><code>POST</code> <code><b>/events/remove/</b></code> <code>Remove events from the calendar</code></summary>

#### Request Object

```javascript
{
    events: [event_ids]
}
```

#### Parameters

> | name      |  type     | data type               | description                                                           |
> |-----------|-----------|-------------------------|-----------------------------------------------------------------------|
> | none      |  required | object (json or yaml)   | n/a  |


#### Responses

> | http code     | content-type                      | response                                                            |
> |---------------|-----------------------------------|---------------------------------------------------------------------|
> | `200`         | `text/plain;charset=utf-8`        | `All events were removed succesfully`                                |
> | `400`         | `text/plain;charset=utf-8`                | error_string                            |
> | `500`         | `text/plain;charset=utf-8`         | error_string                                                                |

</details>
