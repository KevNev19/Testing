package io.swagger.api;

import io.swagger.model.AirwaybillPost;
import io.swagger.model.AirwaybillView;
import io.swagger.model.ErrorResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
public class AirwaybillsApiController implements AirwaybillsApi {

    private static final Logger log = LoggerFactory.getLogger(AirwaybillsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AirwaybillsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<AirwaybillView> getAirwaybillGivenAirwaybillNumber(@ApiParam(value = "expected reponse mime type" ,required=true) @RequestHeader(value="accept", required=true) String accept,@ApiParam(value = "Airwaybill number of the cargo for acceptance.",required=true) @PathVariable("airwaybillId") String airwaybillId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AirwaybillView>(objectMapper.readValue("{  \"airwaybillPrefix\" : \"airwaybillPrefix\",  \"handlingInformation\" : {    \"ssrRemarks\" : [ \"ssrRemarks\", \"ssrRemarks\" ],    \"osiRemarks\" : [ \"osiRemarks\", \"osiRemarks\" ]  },  \"euPallets\" : 2,  \"origin\" : \"origin\",  \"part\" : [ {    \"doneXray\" : true,    \"blockedForManifesting\" : true,    \"link\" : {      \"templated\" : true,      \"rel\" : \"rel\",      \"href\" : \"href\"    },    \"weight\" : {      \"amount\" : 6.02745618307040320615897144307382404804229736328125,      \"unit\" : \"unit\"    },    \"specialHandling\" : {      \"shccodes\" : [ \"shccodes\", \"shccodes\" ]    },    \"itinerary\" : [ {      \"segment\" : 6,      \"origin\" : \"origin\",      \"transportMeans\" : \"transportMeans\",      \"destination\" : \"destination\"    }, {      \"segment\" : 6,      \"origin\" : \"origin\",      \"transportMeans\" : \"transportMeans\",      \"destination\" : \"destination\"    } ],    \"receivedPieces\" : 1,    \"acceptanceStatus\" : \"acceptanceStatus\",    \"pieces\" : 1,    \"volume\" : {      \"amount\" : 6.02745618307040320615897144307382404804229736328125,      \"unit\" : \"unit\"    },    \"receivedWeight\" : {      \"amount\" : 6.02745618307040320615897144307382404804229736328125,      \"unit\" : \"unit\"    },    \"numberOfSplits\" : 7,    \"security\" : true,    \"split\" : [ {      \"pieces\" : 4,      \"volume\" : {        \"amount\" : 6.02745618307040320615897144307382404804229736328125,        \"unit\" : \"unit\"      },      \"airwaybill\" : [ {        \"airwaybillPrefix\" : \"airwaybillPrefix\",        \"origin\" : \"origin\",        \"id\" : \"id\",        \"dest\" : \"dest\",        \"airwaybillSerial\" : \"airwaybillSerial\"      }, {        \"airwaybillPrefix\" : \"airwaybillPrefix\",        \"origin\" : \"origin\",        \"id\" : \"id\",        \"dest\" : \"dest\",        \"airwaybillSerial\" : \"airwaybillSerial\"      } ],      \"link\" : {        \"templated\" : true,        \"rel\" : \"rel\",        \"href\" : \"href\"      },      \"weight\" : {        \"amount\" : 6.02745618307040320615897144307382404804229736328125,        \"unit\" : \"unit\"      },      \"specialHandling\" : {        \"shccodes\" : [ \"shccodes\", \"shccodes\" ]      },      \"id\" : \"id\",      \"houseAirwaybill\" : [ {        \"pieces\" : 1,        \"volume\" : {          \"amount\" : 6.02745618307040320615897144307382404804229736328125,          \"unit\" : \"unit\"        },        \"link\" : {          \"templated\" : true,          \"rel\" : \"rel\",          \"href\" : \"href\"        },        \"weight\" : {          \"amount\" : 6.02745618307040320615897144307382404804229736328125,          \"unit\" : \"unit\"        },        \"id\" : \"id\",        \"houseAirwaybill\" : {          \"masterAirwaybill\" : {            \"airwaybillPrefix\" : \"airwaybillPrefix\",            \"origin\" : \"origin\",            \"id\" : \"id\",            \"dest\" : \"dest\",            \"airwaybillSerial\" : \"airwaybillSerial\"          },          \"houseAirwaybillNumber\" : \"houseAirwaybillNumber\",          \"link\" : {            \"templated\" : true,            \"rel\" : \"rel\",            \"href\" : \"href\"          },          \"id\" : \"id\"        },        \"dimension\" : {          \"measurements\" : [ {            \"pieces\" : 2,            \"length\" : 7,            \"width\" : 9,            \"height\" : 3          }, {            \"pieces\" : 2,            \"length\" : 7,            \"width\" : 9,            \"height\" : 3          } ]        }      }, {        \"pieces\" : 1,        \"volume\" : {          \"amount\" : 6.02745618307040320615897144307382404804229736328125,          \"unit\" : \"unit\"        },        \"link\" : {          \"templated\" : true,          \"rel\" : \"rel\",          \"href\" : \"href\"        },        \"weight\" : {          \"amount\" : 6.02745618307040320615897144307382404804229736328125,          \"unit\" : \"unit\"        },        \"id\" : \"id\",        \"houseAirwaybill\" : {          \"masterAirwaybill\" : {            \"airwaybillPrefix\" : \"airwaybillPrefix\",            \"origin\" : \"origin\",            \"id\" : \"id\",            \"dest\" : \"dest\",            \"airwaybillSerial\" : \"airwaybillSerial\"          },          \"houseAirwaybillNumber\" : \"houseAirwaybillNumber\",          \"link\" : {            \"templated\" : true,            \"rel\" : \"rel\",            \"href\" : \"href\"          },          \"id\" : \"id\"        },        \"dimension\" : {          \"measurements\" : [ {            \"pieces\" : 2,            \"length\" : 7,            \"width\" : 9,            \"height\" : 3          }, {            \"pieces\" : 2,            \"length\" : 7,            \"width\" : 9,            \"height\" : 3          } ]        }      } ],      \"dimension\" : {        \"measurements\" : [ {          \"pieces\" : 2,          \"length\" : 7,          \"width\" : 9,          \"height\" : 3        }, {          \"pieces\" : 2,          \"length\" : 7,          \"width\" : 9,          \"height\" : 3        } ]      }    }, {      \"pieces\" : 4,      \"volume\" : {        \"amount\" : 6.02745618307040320615897144307382404804229736328125,        \"unit\" : \"unit\"      },      \"airwaybill\" : [ {        \"airwaybillPrefix\" : \"airwaybillPrefix\",        \"origin\" : \"origin\",        \"id\" : \"id\",        \"dest\" : \"dest\",        \"airwaybillSerial\" : \"airwaybillSerial\"      }, {        \"airwaybillPrefix\" : \"airwaybillPrefix\",        \"origin\" : \"origin\",        \"id\" : \"id\",        \"dest\" : \"dest\",        \"airwaybillSerial\" : \"airwaybillSerial\"      } ],      \"link\" : {        \"templated\" : true,        \"rel\" : \"rel\",        \"href\" : \"href\"      },      \"weight\" : {        \"amount\" : 6.02745618307040320615897144307382404804229736328125,        \"unit\" : \"unit\"      },      \"specialHandling\" : {        \"shccodes\" : [ \"shccodes\", \"shccodes\" ]      },      \"id\" : \"id\",      \"houseAirwaybill\" : [ {        \"pieces\" : 1,        \"volume\" : {          \"amount\" : 6.02745618307040320615897144307382404804229736328125,          \"unit\" : \"unit\"        },        \"link\" : {          \"templated\" : true,          \"rel\" : \"rel\",          \"href\" : \"href\"        },        \"weight\" : {          \"amount\" : 6.02745618307040320615897144307382404804229736328125,          \"unit\" : \"unit\"        },        \"id\" : \"id\",        \"houseAirwaybill\" : {          \"masterAirwaybill\" : {            \"airwaybillPrefix\" : \"airwaybillPrefix\",            \"origin\" : \"origin\",            \"id\" : \"id\",            \"dest\" : \"dest\",            \"airwaybillSerial\" : \"airwaybillSerial\"          },          \"houseAirwaybillNumber\" : \"houseAirwaybillNumber\",          \"link\" : {            \"templated\" : true,            \"rel\" : \"rel\",            \"href\" : \"href\"          },          \"id\" : \"id\"        },        \"dimension\" : {          \"measurements\" : [ {            \"pieces\" : 2,            \"length\" : 7,            \"width\" : 9,            \"height\" : 3          }, {            \"pieces\" : 2,            \"length\" : 7,            \"width\" : 9,            \"height\" : 3          } ]        }      }, {        \"pieces\" : 1,        \"volume\" : {          \"amount\" : 6.02745618307040320615897144307382404804229736328125,          \"unit\" : \"unit\"        },        \"link\" : {          \"templated\" : true,          \"rel\" : \"rel\",          \"href\" : \"href\"        },        \"weight\" : {          \"amount\" : 6.02745618307040320615897144307382404804229736328125,          \"unit\" : \"unit\"        },        \"id\" : \"id\",        \"houseAirwaybill\" : {          \"masterAirwaybill\" : {            \"airwaybillPrefix\" : \"airwaybillPrefix\",            \"origin\" : \"origin\",            \"id\" : \"id\",            \"dest\" : \"dest\",            \"airwaybillSerial\" : \"airwaybillSerial\"          },          \"houseAirwaybillNumber\" : \"houseAirwaybillNumber\",          \"link\" : {            \"templated\" : true,            \"rel\" : \"rel\",            \"href\" : \"href\"          },          \"id\" : \"id\"        },        \"dimension\" : {          \"measurements\" : [ {            \"pieces\" : 2,            \"length\" : 7,            \"width\" : 9,            \"height\" : 3          }, {            \"pieces\" : 2,            \"length\" : 7,            \"width\" : 9,            \"height\" : 3          } ]        }      } ],      \"dimension\" : {        \"measurements\" : [ {          \"pieces\" : 2,          \"length\" : 7,          \"width\" : 9,          \"height\" : 3        }, {          \"pieces\" : 2,          \"length\" : 7,          \"width\" : 9,          \"height\" : 3        } ]      }    } ],    \"receivedVolume\" : {      \"amount\" : 6.02745618307040320615897144307382404804229736328125,      \"unit\" : \"unit\"    },    \"id\" : \"id\",    \"readyForCarriageChecked\" : true  }, {    \"doneXray\" : true,    \"blockedForManifesting\" : true,    \"link\" : {      \"templated\" : true,      \"rel\" : \"rel\",      \"href\" : \"href\"    },    \"weight\" : {      \"amount\" : 6.02745618307040320615897144307382404804229736328125,      \"unit\" : \"unit\"    },    \"specialHandling\" : {      \"shccodes\" : [ \"shccodes\", \"shccodes\" ]    },    \"itinerary\" : [ {      \"segment\" : 6,      \"origin\" : \"origin\",      \"transportMeans\" : \"transportMeans\",      \"destination\" : \"destination\"    }, {      \"segment\" : 6,      \"origin\" : \"origin\",      \"transportMeans\" : \"transportMeans\",      \"destination\" : \"destination\"    } ],    \"receivedPieces\" : 1,    \"acceptanceStatus\" : \"acceptanceStatus\",    \"pieces\" : 1,    \"volume\" : {      \"amount\" : 6.02745618307040320615897144307382404804229736328125,      \"unit\" : \"unit\"    },    \"receivedWeight\" : {      \"amount\" : 6.02745618307040320615897144307382404804229736328125,      \"unit\" : \"unit\"    },    \"numberOfSplits\" : 7,    \"security\" : true,    \"split\" : [ {      \"pieces\" : 4,      \"volume\" : {        \"amount\" : 6.02745618307040320615897144307382404804229736328125,        \"unit\" : \"unit\"      },      \"airwaybill\" : [ {        \"airwaybillPrefix\" : \"airwaybillPrefix\",        \"origin\" : \"origin\",        \"id\" : \"id\",        \"dest\" : \"dest\",        \"airwaybillSerial\" : \"airwaybillSerial\"      }, {        \"airwaybillPrefix\" : \"airwaybillPrefix\",        \"origin\" : \"origin\",        \"id\" : \"id\",        \"dest\" : \"dest\",        \"airwaybillSerial\" : \"airwaybillSerial\"      } ],      \"link\" : {        \"templated\" : true,        \"rel\" : \"rel\",        \"href\" : \"href\"      },      \"weight\" : {        \"amount\" : 6.02745618307040320615897144307382404804229736328125,        \"unit\" : \"unit\"      },      \"specialHandling\" : {        \"shccodes\" : [ \"shccodes\", \"shccodes\" ]      },      \"id\" : \"id\",      \"houseAirwaybill\" : [ {        \"pieces\" : 1,        \"volume\" : {          \"amount\" : 6.02745618307040320615897144307382404804229736328125,          \"unit\" : \"unit\"        },        \"link\" : {          \"templated\" : true,          \"rel\" : \"rel\",          \"href\" : \"href\"        },        \"weight\" : {          \"amount\" : 6.02745618307040320615897144307382404804229736328125,          \"unit\" : \"unit\"        },        \"id\" : \"id\",        \"houseAirwaybill\" : {          \"masterAirwaybill\" : {            \"airwaybillPrefix\" : \"airwaybillPrefix\",            \"origin\" : \"origin\",            \"id\" : \"id\",            \"dest\" : \"dest\",            \"airwaybillSerial\" : \"airwaybillSerial\"          },          \"houseAirwaybillNumber\" : \"houseAirwaybillNumber\",          \"link\" : {            \"templated\" : true,            \"rel\" : \"rel\",            \"href\" : \"href\"          },          \"id\" : \"id\"        },        \"dimension\" : {          \"measurements\" : [ {            \"pieces\" : 2,            \"length\" : 7,            \"width\" : 9,            \"height\" : 3          }, {            \"pieces\" : 2,            \"length\" : 7,            \"width\" : 9,            \"height\" : 3          } ]        }      }, {        \"pieces\" : 1,        \"volume\" : {          \"amount\" : 6.02745618307040320615897144307382404804229736328125,          \"unit\" : \"unit\"        },        \"link\" : {          \"templated\" : true,          \"rel\" : \"rel\",          \"href\" : \"href\"        },        \"weight\" : {          \"amount\" : 6.02745618307040320615897144307382404804229736328125,          \"unit\" : \"unit\"        },        \"id\" : \"id\",        \"houseAirwaybill\" : {          \"masterAirwaybill\" : {            \"airwaybillPrefix\" : \"airwaybillPrefix\",            \"origin\" : \"origin\",            \"id\" : \"id\",            \"dest\" : \"dest\",            \"airwaybillSerial\" : \"airwaybillSerial\"          },          \"houseAirwaybillNumber\" : \"houseAirwaybillNumber\",          \"link\" : {            \"templated\" : true,            \"rel\" : \"rel\",            \"href\" : \"href\"          },          \"id\" : \"id\"        },        \"dimension\" : {          \"measurements\" : [ {            \"pieces\" : 2,            \"length\" : 7,            \"width\" : 9,            \"height\" : 3          }, {            \"pieces\" : 2,            \"length\" : 7,            \"width\" : 9,            \"height\" : 3          } ]        }      } ],      \"dimension\" : {        \"measurements\" : [ {          \"pieces\" : 2,          \"length\" : 7,          \"width\" : 9,          \"height\" : 3        }, {          \"pieces\" : 2,          \"length\" : 7,          \"width\" : 9,          \"height\" : 3        } ]      }    }, {      \"pieces\" : 4,      \"volume\" : {        \"amount\" : 6.02745618307040320615897144307382404804229736328125,        \"unit\" : \"unit\"      },      \"airwaybill\" : [ {        \"airwaybillPrefix\" : \"airwaybillPrefix\",        \"origin\" : \"origin\",        \"id\" : \"id\",        \"dest\" : \"dest\",        \"airwaybillSerial\" : \"airwaybillSerial\"      }, {        \"airwaybillPrefix\" : \"airwaybillPrefix\",        \"origin\" : \"origin\",        \"id\" : \"id\",        \"dest\" : \"dest\",        \"airwaybillSerial\" : \"airwaybillSerial\"      } ],      \"link\" : {        \"templated\" : true,        \"rel\" : \"rel\",        \"href\" : \"href\"      },      \"weight\" : {        \"amount\" : 6.02745618307040320615897144307382404804229736328125,        \"unit\" : \"unit\"      },      \"specialHandling\" : {        \"shccodes\" : [ \"shccodes\", \"shccodes\" ]      },      \"id\" : \"id\",      \"houseAirwaybill\" : [ {        \"pieces\" : 1,        \"volume\" : {          \"amount\" : 6.02745618307040320615897144307382404804229736328125,          \"unit\" : \"unit\"        },        \"link\" : {          \"templated\" : true,          \"rel\" : \"rel\",          \"href\" : \"href\"        },        \"weight\" : {          \"amount\" : 6.02745618307040320615897144307382404804229736328125,          \"unit\" : \"unit\"        },        \"id\" : \"id\",        \"houseAirwaybill\" : {          \"masterAirwaybill\" : {            \"airwaybillPrefix\" : \"airwaybillPrefix\",            \"origin\" : \"origin\",            \"id\" : \"id\",            \"dest\" : \"dest\",            \"airwaybillSerial\" : \"airwaybillSerial\"          },          \"houseAirwaybillNumber\" : \"houseAirwaybillNumber\",          \"link\" : {            \"templated\" : true,            \"rel\" : \"rel\",            \"href\" : \"href\"          },          \"id\" : \"id\"        },        \"dimension\" : {          \"measurements\" : [ {            \"pieces\" : 2,            \"length\" : 7,            \"width\" : 9,            \"height\" : 3          }, {            \"pieces\" : 2,            \"length\" : 7,            \"width\" : 9,            \"height\" : 3          } ]        }      }, {        \"pieces\" : 1,        \"volume\" : {          \"amount\" : 6.02745618307040320615897144307382404804229736328125,          \"unit\" : \"unit\"        },        \"link\" : {          \"templated\" : true,          \"rel\" : \"rel\",          \"href\" : \"href\"        },        \"weight\" : {          \"amount\" : 6.02745618307040320615897144307382404804229736328125,          \"unit\" : \"unit\"        },        \"id\" : \"id\",        \"houseAirwaybill\" : {          \"masterAirwaybill\" : {            \"airwaybillPrefix\" : \"airwaybillPrefix\",            \"origin\" : \"origin\",            \"id\" : \"id\",            \"dest\" : \"dest\",            \"airwaybillSerial\" : \"airwaybillSerial\"          },          \"houseAirwaybillNumber\" : \"houseAirwaybillNumber\",          \"link\" : {            \"templated\" : true,            \"rel\" : \"rel\",            \"href\" : \"href\"          },          \"id\" : \"id\"        },        \"dimension\" : {          \"measurements\" : [ {            \"pieces\" : 2,            \"length\" : 7,            \"width\" : 9,            \"height\" : 3          }, {            \"pieces\" : 2,            \"length\" : 7,            \"width\" : 9,            \"height\" : 3          } ]        }      } ],      \"dimension\" : {        \"measurements\" : [ {          \"pieces\" : 2,          \"length\" : 7,          \"width\" : 9,          \"height\" : 3        }, {          \"pieces\" : 2,          \"length\" : 7,          \"width\" : 9,          \"height\" : 3        } ]      }    } ],    \"receivedVolume\" : {      \"amount\" : 6.02745618307040320615897144307382404804229736328125,      \"unit\" : \"unit\"    },    \"id\" : \"id\",    \"readyForCarriageChecked\" : true  } ],  \"destination\" : \"destination\",  \"specialHandling\" : {    \"shccodes\" : [ \"shccodes\", \"shccodes\" ]  },  \"airwaybillSerial\" : \"airwaybillSerial\",  \"isBUP\" : true,  \"pieces\" : 0,  \"voulume\" : {    \"amount\" : 6.02745618307040320615897144307382404804229736328125,    \"unit\" : \"unit\"  },  \"oci\" : {    \"measurements\" : [ {      \"country\" : \"country\",      \"note\" : \"note\",      \"custom\" : \"custom\",      \"info\" : \"info\"    }, {      \"country\" : \"country\",      \"note\" : \"note\",      \"custom\" : \"custom\",      \"info\" : \"info\"    } ]  },  \"isMaster\" : true,  \"rcvdPieces\" : 1,  \"previouslyRcvdPieces\" : 5,  \"airwaybillId\" : \"airwaybillId\",  \"dimension\" : {    \"measurements\" : [ {      \"pieces\" : 2,      \"length\" : 7,      \"width\" : 9,      \"height\" : 3    }, {      \"pieces\" : 2,      \"length\" : 7,      \"width\" : 9,      \"height\" : 3    } ]  },  \"readyForCarriageChecked\" : true,  \"sendFsu\" : true,  \"doneXray\" : true,  \"blockedForManifesting\" : true,  \"weight\" : {    \"amount\" : 6.02745618307040320615897144307382404804229736328125,    \"unit\" : \"unit\"  },  \"waitForTotalStatus\" : \"waitForTotalStatus\",  \"rcvdWeight\" : {    \"amount\" : 6.02745618307040320615897144307382404804229736328125,    \"unit\" : \"unit\"  },  \"rcvdVolume\" : {    \"amount\" : 6.02745618307040320615897144307382404804229736328125,    \"unit\" : \"unit\"  },  \"preferredLocation\" : \"preferredLocation\",  \"acceptanceStatus\" : \"acceptanceStatus\",  \"numberOfParts\" : 1,  \"previouslyRcvdWeight\" : 5.63737665663332876420099637471139430999755859375,  \"location\" : \"location\",  \"houseAirwaybill\" : [ {    \"bookedPieces\" : 4,    \"receivedWeight\" : {      \"amount\" : 6.02745618307040320615897144307382404804229736328125,      \"unit\" : \"unit\"    },    \"handlingInformation\" : {      \"ssrRemarks\" : [ \"ssrRemarks\", \"ssrRemarks\" ],      \"osiRemarks\" : [ \"osiRemarks\", \"osiRemarks\" ]    },    \"masterAirwaybillId\" : \"masterAirwaybillId\",    \"houseAirwaybillNumber\" : \"houseAirwaybillNumber\",    \"link\" : {      \"templated\" : true,      \"rel\" : \"rel\",      \"href\" : \"href\"    },    \"bookedWeight\" : {      \"amount\" : 6.02745618307040320615897144307382404804229736328125,      \"unit\" : \"unit\"    },    \"id\" : \"id\",    \"receivedPieces\" : 7  }, {    \"bookedPieces\" : 4,    \"receivedWeight\" : {      \"amount\" : 6.02745618307040320615897144307382404804229736328125,      \"unit\" : \"unit\"    },    \"handlingInformation\" : {      \"ssrRemarks\" : [ \"ssrRemarks\", \"ssrRemarks\" ],      \"osiRemarks\" : [ \"osiRemarks\", \"osiRemarks\" ]    },    \"masterAirwaybillId\" : \"masterAirwaybillId\",    \"houseAirwaybillNumber\" : \"houseAirwaybillNumber\",    \"link\" : {      \"templated\" : true,      \"rel\" : \"rel\",      \"href\" : \"href\"    },    \"bookedWeight\" : {      \"amount\" : 6.02745618307040320615897144307382404804229736328125,      \"unit\" : \"unit\"    },    \"id\" : \"id\",    \"receivedPieces\" : 7  } ],  \"defaultLocation\" : \"defaultLocation\",  \"remarks\" : \"remarks\"}", AirwaybillView.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AirwaybillView>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AirwaybillView>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> saveAcceptance(@ApiParam(value = "Damage report object that needs to be added" ,required=true )  @Valid @RequestBody AirwaybillPost damage) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}