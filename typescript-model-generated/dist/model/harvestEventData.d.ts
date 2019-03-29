export interface HarvestEventData {
    teamId?: string;
    type?: HarvestEventData.TypeEnum;
    productionLineId?: string;
}
export interface HarvestEventDataOpt {
    teamId?: string;
    type?: HarvestEventData.TypeEnum;
    productionLineId?: string;
}
export declare namespace HarvestEventData {
    type TypeEnum = 'BAGGING' | 'CUTTING' | 'BOXING';
    const TypeEnum: {
        BAGGING: TypeEnum;
        CUTTING: TypeEnum;
        BOXING: TypeEnum;
    };
}
