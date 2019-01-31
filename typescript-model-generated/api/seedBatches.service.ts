import { ErrorResponse } from '../model/errorResponse';
import { SeedBatch } from '../model/seedBatch';

export class SeedBatchesService {

  private token: string;
  private basePath: string;

  constructor(token: string) {
    this.token = token;
    this.basePath = '/';
  }


  /**
   * 
   * @summary Create new seed batch
   * @param body Wastage reason to be added
  */
  public createSeedBatch(body: SeedBatch, ):Promise<SeedBatch> {
    const url = `/v1/seedBatches`;    
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
   * @summary Deletes a seed batch
   * @param seedBatchId SeedBatchId
  */
  public deleteSeedBatch(seedBatchId: string, ):Promise<any> {
    const url = `/v1/seedBatches/${encodeURIComponent(String(seedBatchId))}`;    
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
   * @summary Find a seed batch
   * @param seedBatchId Wastage reason id
  */
  public findSeedBatch(seedBatchId: string, ):Promise<SeedBatch> {
    const url = `/v1/seedBatches/${encodeURIComponent(String(seedBatchId))}`;    
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
   * @summary List all seed batches
   * @param firstResult First index of results to be returned
   * @param maxResults How many items to return at one time
  */
  public listSeedBatches(firstResult?: number, maxResults?: number, ):Promise<Array<SeedBatch>> {
    const url = `/v1/seedBatches`;    
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
   * @summary Updates a seed batch
   * @param body Request payload
   * @param seedBatchId Wastage reason id
  */
  public updateSeedBatch(body: SeedBatch, seedBatchId: string, ):Promise<SeedBatch> {
    const url = `/v1/seedBatches/${encodeURIComponent(String(seedBatchId))}`;    
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