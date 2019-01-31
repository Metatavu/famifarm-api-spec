import { ErrorResponse } from '../model/errorResponse';
import { Seed } from '../model/seed';

export class SeedsService {

  private token: string;
  private basePath: string;

  constructor(token: string) {
    this.token = token;
    this.basePath = '/';
  }


  /**
   * 
   * @summary Create new seed
   * @param body Seed to be added
  */
  public createSeed(body: Seed, ):Promise<Seed> {
    const url = `/v1/seeds`;    
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
   * @summary Deletes a seed
   * @param seedId Seed id
  */
  public deleteSeed(seedId: string, ):Promise<any> {
    const url = `/v1/seeds/${encodeURIComponent(String(seedId))}`;    
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
   * @summary Find a seed
   * @param seedId Seed id
  */
  public findSeed(seedId: string, ):Promise<Seed> {
    const url = `/v1/seeds/${encodeURIComponent(String(seedId))}`;    
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
   * @summary List all seeds
   * @param firstResult First index of results to be returned
   * @param maxResults How many items to return at one time
  */
  public listSeeds(firstResult?: number, maxResults?: number, ):Promise<Array<Seed>> {
    const url = `/v1/seeds`;    
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
   * @summary Updates a seed
   * @param body Request payload
   * @param seedId Seed id
  */
  public updateSeed(body: Seed, seedId: string, ):Promise<Seed> {
    const url = `/v1/seeds/${encodeURIComponent(String(seedId))}`;    
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