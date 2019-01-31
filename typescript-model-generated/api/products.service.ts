import { ErrorResponse } from '../model/errorResponse';
import { Product } from '../model/product';

export class ProductsService {

  private token: string;
  private basePath: string;

  constructor(token: string) {
    this.token = token;
    this.basePath = '/';
  }


  /**
   * 
   * @summary Create new product
   * @param body Product to be added
  */
  public createProduct(body: Product, ):Promise<Product> {
    const url = `/v1/products`;    
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
   * @summary Deletes a product
   * @param productId Product id
  */
  public deleteProduct(productId: string, ):Promise<any> {
    const url = `/v1/products/${encodeURIComponent(String(productId))}`;    
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
   * @summary Find a product
   * @param productId Product id
  */
  public findProduct(productId: string, ):Promise<Product> {
    const url = `/v1/products/${encodeURIComponent(String(productId))}`;    
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
   * @summary List all products
   * @param firstResult First index of results to be returned
   * @param maxResults How many items to return at one time
  */
  public listProducts(firstResult?: number, maxResults?: number, ):Promise<Array<Product>> {
    const url = `/v1/products`;    
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
   * @summary Updates a product
   * @param body Request payload
   * @param productId Product id
  */
  public updateProduct(body: Product, productId: string, ):Promise<Product> {
    const url = `/v1/products/${encodeURIComponent(String(productId))}`;    
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