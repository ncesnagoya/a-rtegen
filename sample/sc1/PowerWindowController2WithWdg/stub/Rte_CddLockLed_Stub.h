/*
 * File: Rte_CddLockLed.h
 *
 * Generated by A-RTEGEN.
 *
 * Generator version : 1.2.1
 */

//#ifdef RTE_APPLICATION_HEADER_FILE
//#error Multiple application header files included.
//#endif /* RTE_APPLICATION_HEADER_FILE */
#define RTE_APPLICATION_HEADER_FILE

//#include "Rte_CddLockLed_Type.h"

#ifdef __cplusplus
extern "C" {
#endif /* __cplusplus */

/*
 * RTE API Constant Definitions
 */

/*
 * Internal Global Variable Declarations
 */

/*
 * RTE API Definitions
 */

/*
 * RunnableEntity Declarations
 */
#define CddLockLed_START_SEC_CODE
//#include "CddLockLed_MemMap.h" /* MISRA RULE 19.1 VIOLATION : It won't be fixed because of Specification of AUTOSAR Memory Mapping */

extern void	SetLedStateWdgOK();
extern void	SetLedStateWdgFAILED();
extern void	SetLedStateWdgEXPIRED();
extern void	SetLedStateWdgSTOPPED();
extern void	SetLedStateWdgCLEAR();

#define CddLockLed_STOP_SEC_CODE
//#include "CddLockLed_MemMap.h" /* MISRA RULE 19.1 VIOLATION : It won't be fixed because of Specification of AUTOSAR Memory Mapping */

/*
 * RTE API Implementation Function Declarations
 */

#ifdef __cplusplus
} /* extern "C" */
#endif /* __cplusplus */
