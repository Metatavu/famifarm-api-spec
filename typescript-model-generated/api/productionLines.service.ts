import { ErrorResponse } from '../model/errorResponse';
import { ProductionLine } from '../model/productionLine';

export class ProductionLinesService {

  private token: string;
  private basePath: string;

  constructor(token: string) {
    this.token = token;
    this.basePath = '/';
  }


  /**
   * 
   * @summary Create new production line
   * @param body Wastage reason to be added
  */
  public createProductionLine(body: ProductionLine, ):Promise<ProductionLine> {
    const url = `/v1/productionLines`;    
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
   * @summary Deletes a production line
   * @param productionLineId ProductionLineId
  */
  public deleteProductionLine(productionLineId: string, ):Promise<any> {
    const url = `/v1/productionLines/${encodeURIComponent(String(productionLineId))}`;    
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
   * @summary Find a production line
   * @param productionLineId Wastage reason id
  */
  public findProductionLine(productionLineId: string, ):Promise<ProductionLine> {
    const url = `/v1/productionLines/${encodeURIComponent(String(productionLineId))}`;    
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
   * @summary List all production lines
   * @param firstResult First index of results to be returned
   * @param maxResults How many items to return at one time
  */
  public listProductionLines(firstResult?: number, maxResults?: number, ):Promise<Array<ProductionLine>> {
    const url = `/v1/productionLines`;    
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
   * @summary Updates a production line
   * @param body Request payload
   * @param productionLineId Wastage reason id
  */
  public updateProductionLine(body: ProductionLine, productionLineId: string, ):Promise<ProductionLine> {
    const url = `/v1/productionLines/${encodeURIComponent(String(productionLineId))}`;    
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