import { ErrorResponse } from '../model/errorResponse';
import { PackageSize } from '../model/packageSize';

export class PackageSizesService {

  private token: string;
  private basePath: string;

  constructor(token: string) {
    this.token = token;
    this.basePath = '/';
  }


  /**
   * 
   * @summary Create new package size
   * @param body Wastage reason to be added
  */
  public createPackageSize(body: PackageSize, ):Promise<PackageSize> {
    const url = `/v1/packageSizes`;    
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
   * @summary Deletes a package size
   * @param packageSizeId PackageSizeId
  */
  public deletePackageSize(packageSizeId: string, ):Promise<any> {
    const url = `/v1/packageSizes/${encodeURIComponent(String(packageSizeId))}`;    
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
   * @summary Find a package size
   * @param packageSizeId Wastage reason id
  */
  public findPackageSize(packageSizeId: string, ):Promise<PackageSize> {
    const url = `/v1/packageSizes/${encodeURIComponent(String(packageSizeId))}`;    
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
   * @summary List all package sizes
   * @param firstResult First index of results to be returned
   * @param maxResults How many items to return at one time
  */
  public listPackageSizes(firstResult?: number, maxResults?: number, ):Promise<Array<PackageSize>> {
    const url = `/v1/packageSizes`;    
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
   * @summary Updates a package size
   * @param body Request payload
   * @param packageSizeId Wastage reason id
  */
  public updatePackageSize(body: PackageSize, packageSizeId: string, ):Promise<PackageSize> {
    const url = `/v1/packageSizes/${encodeURIComponent(String(packageSizeId))}`;    
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