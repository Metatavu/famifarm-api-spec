/**
 * Famifarm-API
 * Famifarm API specification
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


export interface Draft { 
    id?: string;
    type: string;
    data: string;
    /**
     * Id of user who added draft
     */
    readonly userId?: string;
    /**
     * Time when the draft was created
     */
    readonly createdAt?: string;
}
export interface DraftOpt { 
    id?: string;
    type?: string;
    data?: string;
    /**
     * Id of user who added draft
     */
    readonly userId?: string;
    /**
     * Time when the draft was created
     */
    readonly createdAt?: string;
}
