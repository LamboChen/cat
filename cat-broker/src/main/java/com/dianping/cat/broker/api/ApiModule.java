package com.dianping.cat.broker.api;

import org.unidal.web.mvc.AbstractModule;
import org.unidal.web.mvc.annotation.ModuleMeta;
import org.unidal.web.mvc.annotation.ModulePagesMeta;

@ModuleMeta(name = "api", defaultInboundAction = "single", defaultTransition = "default", defaultErrorAction = "default")
@ModulePagesMeta({

com.dianping.cat.broker.api.page.single.Handler.class,

com.dianping.cat.broker.api.page.batch.Handler.class
})
public class ApiModule extends AbstractModule {

}
