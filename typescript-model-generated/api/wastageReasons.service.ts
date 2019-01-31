import { ErrorResponse } from '../model/errorResponse';
import { WastageReason } from '../model/wastageReason';

export class WastageReasonsService {

  private token: string;
  private basePath: string;

  constructor(token: string) {
    this.token = token;
    this.basePath = '/';
  }


  /**
   * 
   * @summary Create new wastage reason
   * @param body Wastage reason to be added
  */
  public createWastageReason(body: WastageReason, ):Promise<WastageReason> {
    const url = `/v1/wastageReasons`;    
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
   * @summary Deletes an wastage reason
   * @param wastageReasonId WastageReasonId
  */
  public deleteWastageReason(wastageReasonId: string, ):Promise<any> {
    const url = `/v1/wastageReasons/${encodeURIComponent(String(wastageReasonId))}`;    
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
   * @summary Find an wastage reason
   * @param wastageReasonId Wastage reason id
  */
  public findWastageReason(wastageReasonId: string, ):Promise<WastageReason> {
    const url = `/v1/wastageReasons/${encodeURIComponent(String(wastageReasonId))}`;    
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
   * @summary List all wastage reasons
   * @param firstResult First index of results to be returned
   * @param maxResults How many items to return at one time
  */
  public listWastageReasons(firstResult?: number, maxResults?: number, ):Promise<Array<WastageReason>> {
    const url = `/v1/wastageReasons`;    
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
   * @summary Updates an wastage reason
   * @param body Request payload
   * @param wastageReasonId Wastage reason id
  */
  public updateWastageReason(body: WastageReason, wastageReasonId: string, ):Promise<WastageReason> {
    const url = `/v1/wastageReasons/${encodeURIComponent(String(wastageReasonId))}`;    
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