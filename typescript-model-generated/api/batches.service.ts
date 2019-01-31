import { Batch } from '../model/batch';
import { ErrorResponse } from '../model/errorResponse';

export class BatchesService {

  private token: string;
  private basePath: string;

  constructor(token: string) {
    this.token = token;
    this.basePath = '/';
  }


  /**
   * 
   * @summary Create new batch
   * @param body Batch to be added
  */
  public createBatch(body: Batch, ):Promise<Batch> {
    const url = `/v1/batches`;    
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
   * @summary Deletes a batch
   * @param batchId BatchId
  */
  public deleteBatch(batchId: string, ):Promise<any> {
    const url = `/v1/batches/${encodeURIComponent(String(batchId))}`;    
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
   * @summary Find a batch
   * @param batchId Batch id
  */
  public findBatch(batchId: string, ):Promise<Batch> {
    const url = `/v1/batches/${encodeURIComponent(String(batchId))}`;    
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
   * @summary List all batches
   * @param firstResult Where to start listing
   * @param maxResult How many items to return at one time
  */
  public listBatches(firstResult?: number, maxResult?: number, ):Promise<Array<Batch>> {
    const url = `/v1/batches`;    
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
   * @summary Updates a batch
   * @param body Request payload
   * @param batchId Batch id
  */
  public updateBatch(body: Batch, batchId: string, ):Promise<Batch> {
    const url = `/v1/batches/${encodeURIComponent(String(batchId))}`;    
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