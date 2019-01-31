import { ErrorResponse } from '../model/errorResponse';
import { Event } from '../model/event';

export class EventsService {

  private token: string;
  private basePath: string;

  constructor(token: string) {
    this.token = token;
    this.basePath = '/';
  }


  /**
   * 
   * @summary Create new event
   * @param body Event to be added
  */
  public createEvent(body: Event, ):Promise<Event> {
    const url = `/v1/events`;    
    const options = {
      method: "post",
      headers: {
        "Content-Type": "application/json"
      }
    };

    return fetch(url, options).then((response) => {
      return response.json();
    });
  }


  /**
   * 
   * @summary Deletes an event
   * @param eventId Event id
  */
  public deleteEvent(eventId: string, ):Promise<any> {
    const url = `/v1/events/${encodeURIComponent(String(eventId))}`;    
    const options = {
      method: "delete",
      headers: {
        "Content-Type": "application/json"
      }
    };

    return fetch(url, options).then((response) => {
      return response.json();
    });
  }


  /**
   * 
   * @summary Find an event
   * @param eventId Event id
  */
  public findEvent(eventId: string, ):Promise<Event> {
    const url = `/v1/events/${encodeURIComponent(String(eventId))}`;    
    const options = {
      method: "get",
      headers: {
        "Content-Type": "application/json"
      }
    };

    return fetch(url, options).then((response) => {
      return response.json();
    });
  }


  /**
   * 
   * @summary List all events
   * @param firstResult First index of results to be returned
   * @param maxResults How many items to return at one time
  */
  public listEvents(firstResult?: number, maxResults?: number, ):Promise<Array<Event>> {
    const url = `/v1/events`;    
    const options = {
      method: "get",
      headers: {
        "Content-Type": "application/json"
      }
    };

    return fetch(url, options).then((response) => {
      return response.json();
    });
  }


  /**
   * 
   * @summary Updates an event
   * @param body Request payload
   * @param eventId Event id
  */
  public updateEvent(body: Event, eventId: string, ):Promise<Event> {
    const url = `/v1/events/${encodeURIComponent(String(eventId))}`;    
    const options = {
      method: "put",
      headers: {
        "Content-Type": "application/json"
      }
    };

    return fetch(url, options).then((response) => {
      return response.json();
    });
  }

}