import { ErrorResponse } from '../model/errorResponse';
import { PerformedCultivationAction } from '../model/performedCultivationAction';

export class PerformedCultivationActionsService {

  private token: string;
  private basePath: string;

  constructor(token: string) {
    this.token = token;
    this.basePath = '/';
  }


  /**
   * 
   * @summary Create new performed cultivation action
   * @param body Wastage reason to be added
  */
  public createPerformedCultivationAction(body: PerformedCultivationAction, ):Promise<PerformedCultivationAction> {
    const url = `/v1/performedCultivationActions`;    
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
   * @summary Deletes a performed cultivation action
   * @param performedCultivationActionId PerformedCultivationActionId
  */
  public deletePerformedCultivationAction(performedCultivationActionId: string, ):Promise<any> {
    const url = `/v1/performedCultivationActions/${encodeURIComponent(String(performedCultivationActionId))}`;    
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
   * @summary Find a performed cultivation action
   * @param performedCultivationActionId Wastage reason id
  */
  public findPerformedCultivationAction(performedCultivationActionId: string, ):Promise<PerformedCultivationAction> {
    const url = `/v1/performedCultivationActions/${encodeURIComponent(String(performedCultivationActionId))}`;    
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
   * @summary List all performed cultivation actions
   * @param firstResult First index of results to be returned
   * @param maxResults How many items to return at one time
  */
  public listPerformedCultivationActions(firstResult?: number, maxResults?: number, ):Promise<Array<PerformedCultivationAction>> {
    const url = `/v1/performedCultivationActions`;    
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
   * @summary Updates a performed cultivation action
   * @param body Request payload
   * @param performedCultivationActionId Wastage reason id
  */
  public updatePerformedCultivationAction(body: PerformedCultivationAction, performedCultivationActionId: string, ):Promise<PerformedCultivationAction> {
    const url = `/v1/performedCultivationActions/${encodeURIComponent(String(performedCultivationActionId))}`;    
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