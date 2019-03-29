import { CultivationObservationEventData } from './cultivationObservationEventData';
import { HarvestEventData } from './harvestEventData';
import { PackingEventData } from './packingEventData';
import { PlantingEventData } from './plantingEventData';
import { SowingEventData } from './sowingEventData';
import { TableSpreadEventData } from './tableSpreadEventData';
import { WastageEventData } from './wastageEventData';
export interface Event {
    id?: string;
    batchId: string;
    userId?: string;
    startTime?: string;
    endTime?: string;
    type: Event.TypeEnum;
    data: CultivationObservationEventData | HarvestEventData | PackingEventData | PlantingEventData | SowingEventData | TableSpreadEventData | WastageEventData;
}
export interface EventOpt {
    id?: string;
    batchId?: string;
    userId?: string;
    startTime?: string;
    endTime?: string;
    type?: Event.TypeEnum;
    data?: CultivationObservationEventData | HarvestEventData | PackingEventData | PlantingEventData | SowingEventData | TableSpreadEventData | WastageEventData;
}
export declare namespace Event {
    type TypeEnum = 'PLANTING' | 'SOWING' | 'PACKING' | 'TABLE_SPREAD' | 'CULTIVATION_OBSERVATION' | 'HARVEST' | 'WASTEAGE';
    const TypeEnum: {
        PLANTING: TypeEnum;
        SOWING: TypeEnum;
        PACKING: TypeEnum;
        TABLESPREAD: TypeEnum;
        CULTIVATIONOBSERVATION: TypeEnum;
        HARVEST: TypeEnum;
        WASTEAGE: TypeEnum;
    };
}
