import { CellType } from './cellType';
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
