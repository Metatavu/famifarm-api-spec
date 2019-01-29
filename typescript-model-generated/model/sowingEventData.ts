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
import { CellType } from './cellType';


/**
 * Entry when a batch has been sowed
 */
export interface SowingEventData { 
    productionLineId: string;
    gutterNumber?: number;
    seedBatchId?: string;
    cellType: CellType;
    amount: number;
}
export interface SowingEventDataOpt { 
    productionLineId?: string;
    gutterNumber?: number;
    seedBatchId?: string;
    cellType?: CellType;
    amount?: number;
}
