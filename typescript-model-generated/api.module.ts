import { NgModule, ModuleWithProviders, SkipSelf, Optional } from '@angular/core';
import { Configuration } from './configuration';
import { HttpClient } from '@angular/common/http';


import { BatchesService } from './api/batches.service';
import { EventsService } from './api/events.service';
import { PackageSizesService } from './api/packageSizes.service';
import { PerformedCultivationActionsService } from './api/performedCultivationActions.service';
import { ProductionLinesService } from './api/productionLines.service';
import { ProductsService } from './api/products.service';
import { SeedBatchesService } from './api/seedBatches.service';
import { SeedsService } from './api/seeds.service';
import { TeamsService } from './api/teams.service';
import { WastageReasonsService } from './api/wastageReasons.service';

@NgModule({
  imports:      [],
  declarations: [],
  exports:      [],
  providers: [
    BatchesService,
    EventsService,
    PackageSizesService,
    PerformedCultivationActionsService,
    ProductionLinesService,
    ProductsService,
    SeedBatchesService,
    SeedsService,
    TeamsService,
    WastageReasonsService ]
})
export class ApiModule {
    public static forRoot(configurationFactory: () => Configuration): ModuleWithProviders {
        return {
            ngModule: ApiModule,
            providers: [ { provide: Configuration, useFactory: configurationFactory } ]
        };
    }

    constructor( @Optional() @SkipSelf() parentModule: ApiModule,
                 @Optional() http: HttpClient) {
        if (parentModule) {
            throw new Error('ApiModule is already loaded. Import in your base AppModule only.');
        }
        if (!http) {
            throw new Error('You need to import the HttpClientModule in your AppModule! \n' +
            'See also https://github.com/angular/angular/issues/20575');
        }
    }
}
