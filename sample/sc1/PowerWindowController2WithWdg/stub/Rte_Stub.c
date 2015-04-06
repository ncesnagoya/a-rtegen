/*
 * File: Rte_Partition_Core1BswPartition.c
 *
 * Generated by A-RTEGEN.
 *
 * Generator version : 1.2.0
 */

#define TOPPERS_TRUSTED

#include "Rte_Hook.h"
#include "Rte_Util.h"
#include "Rte_Stub.h"
#include "Rte_Cbk.h"
#include "Rte_Bsw_Api.h"

/*
 * Global Variable Definitions
 */
Std_ReturnType
Rte_Call_PowerWindowController_WindowPositionOut_SetWindowPosition(WindowPosition position)  /* MISRA RULE 8.8 VIOLATION : It won't be fixed because of RTE Specification rte_sws_1006 */
{

	SetWindowPosition(position);

	return(RTE_E_OK);
}

Std_ReturnType
Rte_Call_SensorButton_ButtonStateIn_GetButtonState(ButtonState *up, ButtonState *down)   /* MISRA RULE 8.8 VIOLATION : It won't be fixed because of RTE Specification rte_sws_1006 */
{

	GetButtonState(up, down);

	return(RTE_E_OK);
}

Std_ReturnType
Rte_Call_SensorButton_LedStateOut_SetLedState(LedState state)  /* MISRA RULE 8.8 VIOLATION : It won't be fixed because of RTE Specification rte_sws_1006 */
{

	SetLedState(state);

	return(RTE_E_OK);
}

Std_ReturnType
Rte_Call_SensorButton_LedStateOut_SetLedState2(LedState state)  /* MISRA RULE 8.8 VIOLATION : It won't be fixed because of RTE Specification rte_sws_1006 */
{

	SetLedState2(state);

	return(RTE_E_OK);
}

Std_ReturnType
Rte_Call_SensorButton_LedStateOut_SetLedState3(LedState state)  /* MISRA RULE 8.8 VIOLATION : It won't be fixed because of RTE Specification rte_sws_1006 */
{

	SetLedState3(state);

	return(RTE_E_OK);
}

Std_ReturnType
Rte_Call_SensorButton_LedStateOut_SetLedStateWdgOK()  /* MISRA RULE 8.8 VIOLATION : It won't be fixed because of RTE Specification rte_sws_1006 */
{

	SetLedStateWdgOK();

	return(RTE_E_OK);
}

Std_ReturnType
Rte_Call_SensorButton_LedStateOut_SetLedStateWdgFAILED()  /* MISRA RULE 8.8 VIOLATION : It won't be fixed because of RTE Specification rte_sws_1006 */
{

	SetLedStateWdgFAILED();

	return(RTE_E_OK);
}

Std_ReturnType
Rte_Call_SensorButton_LedStateOut_SetLedStateWdgEXPIRED()  /* MISRA RULE 8.8 VIOLATION : It won't be fixed because of RTE Specification rte_sws_1006 */
{

	SetLedStateWdgEXPIRED();

	return(RTE_E_OK);
}

Std_ReturnType
Rte_Call_SensorButton_LedStateOut_SetLedStateWdgSTOPPED()  /* MISRA RULE 8.8 VIOLATION : It won't be fixed because of RTE Specification rte_sws_1006 */
{

	SetLedStateWdgSTOPPED();

	return(RTE_E_OK);
}

Std_ReturnType
Rte_Call_SensorButton_LedStateOut_SetLedStateWdgCLEAR()  /* MISRA RULE 8.8 VIOLATION : It won't be fixed because of RTE Specification rte_sws_1006 */
{

	SetLedStateWdgCLEAR();

	return(RTE_E_OK);
}

Std_ReturnType
Rte_Call_SensorButton_LockStateIn_GetLockState(LockState *state)  /* MISRA RULE 8.8 VIOLATION : It won't be fixed because of RTE Specification rte_sws_1006 */
{

	GetLockState(state);

	return(RTE_E_OK);
}

Std_ReturnType
Rte_Call_SensorButton_LockStateIn_GetLockState2(LockState *state)  /* MISRA RULE 8.8 VIOLATION : It won't be fixed because of RTE Specification rte_sws_1006 */
{

	GetLockState2(state);

	return(RTE_E_OK);
}

Std_ReturnType
Rte_Call_SensorButton_LockStateIn_GetLockState3(LockState *state)  /* MISRA RULE 8.8 VIOLATION : It won't be fixed because of RTE Specification rte_sws_1006 */
{

	GetLockState3(state);

	return(RTE_E_OK);
}

/*
 * RTE API Implementation Function Definitions
 */
#define RTE_START_SEC_CODE_Core1BswPartition
#include "MemMap.h" /* MISRA RULE 19.1 VIOLATION : It won't be fixed because of Specification of AUTOSAR Memory Mapping */

#if 0
Std_ReturnType
Rte_Call_SensorButton_se1_CheckpointReached()  /* MISRA RULE 8.8 VIOLATION : It won't be fixed because of RTE Specification rte_sws_1006 */
{

	WdgM_CheckpointReached(RTE_PORT_ARG_VALUE_WdgM_serverPort1, RTE_PORT_ARG_VALUE_WdgM_serverPort1_0);

	return(RTE_E_OK);
}

Std_ReturnType
Rte_Call_SensorButton_se2_CheckpointReached()  /* MISRA RULE 8.8 VIOLATION : It won't be fixed because of RTE Specification rte_sws_1006 */
{

	WdgM_CheckpointReached(RTE_PORT_ARG_VALUE_WdgM_serverPort1, RTE_PORT_ARG_VALUE_WdgM_serverPort1_1);

	return(RTE_E_OK);
}

Std_ReturnType
Rte_Call_SensorButton_se3_CheckpointReached()  /* MISRA RULE 8.8 VIOLATION : It won't be fixed because of RTE Specification rte_sws_1006 */
{

	WdgM_CheckpointReached(RTE_PORT_ARG_VALUE_WdgM_serverPort1, RTE_PORT_ARG_VALUE_WdgM_serverPort1_2);

	return(RTE_E_OK);
}

Std_ReturnType
Rte_Call_Client1_clientPort4_operation1()  /* MISRA RULE 8.8 VIOLATION : It won't be fixed because of RTE Specification rte_sws_1006 */
{

	WdgM_CheckpointReached(RTE_PORT_ARG_VALUE_WdgM_serverPort2, RTE_PORT_ARG_VALUE_WdgM_serverPort2_0);

	return(RTE_E_OK);
}

Std_ReturnType
Rte_Call_Client1_clientPort5_operation1()  /* MISRA RULE 8.8 VIOLATION : It won't be fixed because of RTE Specification rte_sws_1006 */
{

	WdgM_CheckpointReached(RTE_PORT_ARG_VALUE_WdgM_serverPort2, RTE_PORT_ARG_VALUE_WdgM_serverPort2_1);

	return(RTE_E_OK);
}

Std_ReturnType
Rte_Call_Client1_clientPort6_operation1()  /* MISRA RULE 8.8 VIOLATION : It won't be fixed because of RTE Specification rte_sws_1006 */
{

	WdgM_CheckpointReached(RTE_PORT_ARG_VALUE_WdgM_serverPort2, RTE_PORT_ARG_VALUE_WdgM_serverPort2_2);

	return(RTE_E_OK);
}
#endif

Std_ReturnType
Rte_Switch_modeWdgMSupervisedEntity_0_currentMode(Rte_ModeType_WdgM_Mode mode)
{
	return (RTE_E_OK);
}

Std_ReturnType
Rte_Switch_modeWdgMSupervisedEntity_1_currentMode(Rte_ModeType_WdgM_Mode mode)
{
	return (RTE_E_OK);
}

Std_ReturnType
Rte_Switch_globalMode_currentMode(Rte_ModeType_WdgM_Mode mode)
{
	WdgState(mode);
	
	return (RTE_E_OK);
}

#define RTE_STOP_SEC_CODE_Core1BswPartition
#include "MemMap.h" /* MISRA RULE 19.1 VIOLATION : It won't be fixed because of Specification of AUTOSAR Memory Mapping */

/*
 * Signal Group Functions
 */

/*
 * Proxy Group Functions
 */

/*
 * RTE Lifecycle API Definitions
 */
#define RTE_START_SEC_CODE_Core1BswPartition
#include "MemMap.h" /* MISRA RULE 19.1 VIOLATION : It won't be fixed because of Specification of AUTOSAR Memory Mapping */

void
Rte_PartitionRestarting_Core1BswPartition(void)
{

}

void
Rte_PartitionTerminated_Core1BswPartition(void)
{

}

Std_ReturnType
Rte_RestartPartition_Core1BswPartition(void)
{

	return(RTE_E_OK);
}

#define RTE_STOP_SEC_CODE_Core1BswPartition
#include "MemMap.h" /* MISRA RULE 19.1 VIOLATION : It won't be fixed because of Specification of AUTOSAR Memory Mapping */

/*
 * COM Callback Definitions
 */

/*
 * TrustedFunction Definitions
 */

/*
 * Basic Software Scheduler API Implementation Function Definitions
 */

/*
 * Basic Software Scheduler Lifecycle API Definitions
 */

/*
 * BSW SchedulableEntity Definitions
 */

/*
 * TaskBody Definitions
 */
#define RTE_START_SEC_CODE_Core1BswPartition
#include "MemMap.h" /* MISRA RULE 19.1 VIOLATION : It won't be fixed because of Specification of AUTOSAR Memory Mapping */

TASK(OsTask_Client1)
{

//	Client1_clientRunnable1();

	(void) Rte_Call_Bsw_TerminateTask();
}

#define RTE_STOP_SEC_CODE_Core1BswPartition
#include "MemMap.h" /* MISRA RULE 19.1 VIOLATION : It won't be fixed because of Specification of AUTOSAR Memory Mapping */
