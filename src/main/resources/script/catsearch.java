function CatSearch()
{
	links=new Array()
	titles=new Array()
	keywords=new Array()

	keywords[0]="AIClearMode AIFlee AIGetMode AIGetMovePos AIJump AISetClass AISetFireTarget AISetLookPos AISetMode AISetMovePos AISetMoveSpeed AISetMoveThing GetActorWeapon IsAiTargetInSight SetActorWeapon";
	titles[0]="AI Verbs";
	links[0]="../cog/verbs/ai/ai_frame.html";

	keywords[1]="GetMaterialCel MaterialAnim SetMaterialCel SetSurfaceCel SetWallCel GetSurfaceAnim GetSurfaceCel GetWallCel StopSurfaceAnim SurfaceAnim StopAnim SurfaceLightAnim SlideCeilingSky SlideHorizonSky SlideSurface SlideWall";
	titles[1]="Anim / Cel Verbs";
	links[1]="../cog/verbs/animcel/animcel_frame.html";

	keywords[2]="CycleCamera GetCameraStateFlags GetCurrentCamera GetPrimaryFocus GetSecondaryFocus SetCameraFocus SetCameraStateFlags SetCurrentCamera SetPOVShake";
	titles[2]="Camera Verbs";
	links[2]="../cog/verbs/camera/camera_frame.html";

	keywords[3]="AddDynamicAdd AddDynamicTint FreeColorEffect ModifyColorEffect NewColorEffect";
	titles[3]="Color Verbs";
	links[3]="../cog/verbs/color/color_frame.html";

	keywords[4]="GetHeadLightIntensity GetHealth GetThingHealth HasLOS HealThing IsCrouching IsThingCrouching jkClearFlags jkGetFlags jkSetFlags jkSetInvis jkSetInvulnerable SetActorExtraSpeed SetHeadLightIntensity SetHealth SetThingHealth";
	titles[4]="Creature Verbs";
	links[4]="../cog/verbs/creature/creature_frame.html";

	keywords[5]="AISetLookFrame AISetMoveFrame GetCurFrame GetGoalFrame JumpToFrame  MoveToFrame PathMovePause PathMoveResume  SkipToFrame WaitForStop  Rotate RotatePivot";
	titles[5]="Frame Verbs";
	links[5]="../cog/verbs/frame/frame_frame.html";

	keywords[6]="ChangeInv GetInv GetInvCog GetInvMax GetInvMin IsInvActivated IsInvAvailable SetBinWait SetInv SetInvActivated SetInvAvailable SetInvFlags";
	titles[6]="Inventory Verbs";
	links[6]="../cog/verbs/inventory/inventory_frame.html";

	keywords[7]="GetKeyLen GetMajorMode jkPlayPOVKey jkStopPOVKey PlayKey PlayMode StopKey";
	titles[7]="Keyframe Verbs";
	links[7]="../cog/verbs/keyframe/keyframe_frame.html";

	keywords[8]="AutoSaveGame GetCeilingSkyOffset GetFlexGameTime GetGameTime GetGravity GetHorizonSkyOffset GetLevelTime GetSectorCount GetSurfaceCount GetThingCount GetThingTemplateCount jkEndLevel SetCeilingSkyOffset SetGravity SetHorizonSkyOffset";
	titles[8]="Level Verbs";
	links[8]="../cog/verbs/level/level_frame.html";

	keywords[9]="GetParam GetSenderID GetSenderRef GetSenderType GetSourceRef GetSourceType KillTimerEx ReturnEx SendMessage SendMessageEx SendTrigger SetParam SetPulse SetTimer SetTimerEx Sleep SetThingPulse SetThingTimer";
	titles[9]="Message Verbs";
	links[9]="../cog/verbs/message/message_frame.html";

	keywords[10]="AmputateJoint DisableIRMode EnableIRMode GetSithMode jkDisableSaber jkEnableSaber jkEndTarget jkSetPersuasionInfo jkSetSaberInfo jkSetTarget jkSetTargetColors ParseArg SkillTarget TakeItem ThingViewDot";
	titles[10]="Misc Verbs";
	links[10]="../cog/verbs/misc/misc_frame.html";

	keywords[11]="ClearMultiModeFlags CreateBackpack GetAbsoluteMaxPlayers GetMaxPlayers GetMultiModeFlags GetNumPlayers GetNumPlayersInTeam GetPlayerTeam GetRespawnMask GetTimeLimit IsMulti IsServer NthBackpackBin NthBackpackValue NumBackpackItems PickupBackpack SetMultiModeFlags SetPlayerTeam SetRespawnMask SetTimeLimit SyncScores SyncSector SyncSurface SyncThingAttachment SyncThingPos SyncThingState";
	titles[11]="Multiplayer Verbs";
	links[11]="../cog/verbs/multiplayer/multiplayer_frame.html";

	keywords[12]="GetAutoPickup GetAutoReload GetAutoSwitch GetDifficulty jkGetSaberCam SetAutoPickup SetAutoReload SetAutoSwitch";
	titles[12]="Option Verbs";
	links[12]="../cog/verbs/options/options_frame.html";

	keywords[13]="GetParticleGrowthSpeed maxthrust GetParticleSize elementsize GetParticleTimeoutRate count SetParticleGrowthSpeed maxthrust SetParticleSize elementsize SetParticleTimeoutRate count";
	titles[13]="Particle Verbs";
	links[13]="../cog/verbs/particle/particle_frame.html";

	keywords[14]="ClearGoalFlags GetLocalPlayerThing GetPlayerNum GetPlayerThing jkClearSuperFlags jkGetChoice jkGetLocalPlayer jkGetSuperFlags jkSetForceSpeed jkSetSuperFlags SetGoalFlags";
	titles[14]="Player Verbs";
	links[14]="../cog/verbs/player/player_frame.html";

	keywords[15]="jkPrintUniString jkStringClear jkStringConcatAsciiString jkStringConcatFlex jkStringConcatFormattedFlex jkStringConcatFormattedInt jkStringConcatInt jkStringConcatPlayerName jkStringConcatSpace jkStringConcatUniString jkStringConcatVector jkStringOutput Print PrintFlex PrintInt PrintVector";
	titles[15]="Print Verbs"
	links[15]="../cog/verbs/print/print_frame.html";

	keywords[16]="AddScoreToTeamMembers GetPlayerKilled GetPlayerKills GetPlayerScore GetPlayerSuicides GetScoreLimit GetTeamScore SetPlayerKilled SetPlayerKills SetPlayerScore SetPlayerSuicides SetScoreLimit SetTeamScore";
	titles[16]="Score Verbs";
	links[16]="../cog/verbs/score/score_frame.html";

	keywords[17]="ClearSectorFlags FirstThingInSector GetColormap GetNumSectorSurfaces GetNumSectorVertices GetSectorCenter GetSectorColormap GetSectorFlags GetSectorLight GetSectorPlayerCount GetSectorSurfaceRef GetSectorThingCount GetSectorThrust GetSectorTint GetSectorVertexPos NextThingInSector PrevThingInSector SectorAdjoins SectorLight SectorPlayerCount SectorThrust SectorThingCount SetColormap SetSectorAdjoins SetSectorColormap SetSectorFlags SetSectorLight SetSectorThrust SetSectorTint";
	titles[17]="Sector Verbs";
	links[17]="../cog/verbs/sector/sector_frame.html";

	keywords[18]="ChangeSoundPitch ChangeSoundVol GetSoundLen PlaySong PlaySoundClass PlaySoundGlobal PlaySoundLocal PlaySoundPos PlaySoundThing SectorSound SetMusicVol StopSound";
	titles[18]="Sound Verbs";
	links[18]="../cog/verbs/sound/sound_frame.html";

	keywords[19]="ClearDebugModeFlags ClearMapModeFlags ClearSubModeFlags GetDebugModeFlags GetMapModeFlags GetSubModeFlags SetDebugModeFlags SetMapModeFlags SetSubModeFlags";
	titles[19]="Special Flag Verbs";
	links[19]="../cog/verbs/specflags/specflags_frame.html";

	keywords[20]="ClearAdjoinFlags ClearFaceType ClearSurfaceFlags GetAdjoinFlags GetFaceGeoMode GetFaceLightMode GetFaceTexMode GetFaceType GetNumSurfaceVertices GetSurfaceAdjoin GetSurfaceCenter GetSurfaceFlags GetSurfaceLight GetSurfaceMat GetSurfaceNormal GetSurfaceSector GetSurfaceVertexPos SetAdjoinFlags SetFaceGeoMode SetFaceLightMode SetFaceTexMode SetFaceType SetSurfaceFlags SetSurfaceLight SetSurfaceMat SurfaceCenter SurfaceLight";
	titles[20]="Surface Verbs";
	links[20]="../cog/verbs/surface/surface_frame.html";

	keywords[21]="BitClear BitSet BitTest GetMasterCog GetSelfCog HeapFree HeapGet HeapNew HeapSet LoadKeyframe LoadModel LoadSound LoadTemplate Rand Reset SetMasterCog ";
	titles[21]="System Verbs";
	links[21]="../cog/verbs/system/system_frame.html";

	keywords[22]="SetThingPos GetThingPos SetThingLook GetThingLVec GetThingRVec GetThingUVec AttachThingToSurf AttachThingtoThing AttachThingtoThingEx CaptureThing CreateThing CreateThingAtPos CreateThingAtPosNR CreateThingNR DamageThing DestroyThing DetachThing FirstThingInView IsThingMoving IsThingVisible NextThingInView ReleaseThing TeleportThing ThingLightAnim IsMoving";
	titles[22]="Thing Action Verbs";
	links[22]="../cog/verbs/thingact/thingact_frame.html";

	keywords[23]="ClearActorFlags ClearExplosionFlags ClearItemFlags ClearParticleFlags ClearPhysicsFlags ClearThingAttachFlags ClearThingFlags ClearTypeFlags ClearWeaponFlags GetActorFlags GetAttachFlags GetExplosionFlags GetItemFlags GetParticleFlags GetPhysicsFlags GetThingAttachFlags GetThingFlags GetTypeFlags GetWeaponFlags SetActorFlags SetExplosionFlags SetItemFlags SetParticleFlags SetPhysicsFlags SetThingAttachFlags SetThingFlags SetTypeFlags SetWeaponFlags";
	titles[23]="Thing Flag Verbs";
	links[23]="../cog/verbs/thingflags/thingflags_frame.html";

	keywords[24]="GetThingCurGeoMode GetThingCurLightMode GetThingCurTexMode GetThingGeoMode GetThingLightMode GetThingTexMode SetThingCurGeoMode SetThingCurLightMode SetThingCurTexMode SetThingGeoMode SetThingLightMode SetThingTexMode";
	titles[24]="Thing Mode Verbs";
	links[24]="../cog/verbs/thingmode/thingmode_frame.html";

	keywords[25]="GetCollideType collide GetLifeLeft timer GetThingCaptureCog GetThingClassCog cog GetThingCollideSize size GetThingFireOffset fireoffset GetThingLight light GetThingMass mass GetThingModel model3d GetThingMoveSize movesize GetThingParent GetThingRespawn respawn GetThingSector GetThingSignature GetThingTemplate GetThingType type GetThingUserData SetCollideType collide SetLifeLeft timer SetThingCaptureCog SetThingClassCog cog SetThingCollideSize size SetThingFireOffset fireoffset SetThingLight light SetThingMass mass SetThingModel model3d SetThingMoveSize movesize SetThingType type SetThingUserData ThingLight light";
	titles[25]="Thing Property Verbs";
	links[25]="../cog/verbs/thingprop/thingprop_frame.html";

	keywords[26]="RandVec VectorAdd VectorCross VectorDist VectorDot VectorLen VectorNorm VectorScale VectorSet VectorSub VectorX VectorY VectorZ";
	titles[26]="Vector Verbs";
	links[26]="../cog/verbs/vector/vector_frame.html";

	keywords[27]="AddThingVel ApplyForce GetThingRotVel GetThingThrust GetThingVel SetThingRotVel SetThingThrust SetThingVel StopThing";
	titles[27]="Velocity Verbs";
	links[27]="../cog/verbs/velocity/velocity_frame.html";

	keywords[28]="ActivateBin ActivateWeapon AssignWeapon AutoSelectWeapon ChangeFireRate DeactivateBin DeactivateWeapon FireProjectile GetCurInvWeapon GetCurWeapon GetCurWeaponMode GetWeaponPriority jkSetPOVModel jkSetWaggle jkSetWeaponMesh SelectWeapon SetArmedMode SetCurInvWeapon SetCurWeapon SetFireWait SetMountWait";
	titles[28]="Weapon Verbs";
	links[28]="../cog/verbs/weapon/weapon_frame.html";

	/*######################################################################*/

	phrase=document.searchform.keywords.value.toLowerCase();
	checker=0;

	if(navigator.appName == 'Netscape')
	{
			w=500; h=400;
			LeftPosition=(screen.width)?(screen.width-w)/2:100;
			TopPosition=(screen.height)?(screen.height-h)/2:100;
			settings='width='+w+',height='+h+',top='+TopPosition+',left='+LeftPosition+',scrollbars=yes,location=no,directories=no,status=no,menubar=no,toolbar=no,resizable=yes';
			output=window.open("", "Search Results", settings);
	}
	else
	{
		output=self;
	}

	output.document.write('<HTML><HEAD>');
	output.document.writeln('<TITLE>Search Results</TITLE>');
	output.document.writeln('<LINK REL=stylesheet TYPE="text/css" HREF="../css/main.css">');
	output.document.writeln('</HEAD><BODY class=grayback onLoad="focus()">');
	output.document.writeln('<TABLE border=5 cellpadding=5 width="100%" bgcolor=#D2D2D2 class=search>');
	output.document.writeln('<TR><TH colspan=2 class=big>Search Results</TD></TR>');
	output.document.write('<TR><TD colspan=2>You searched for: <SPAN class=search>')
	output.document.writeln(phrase + "</SPAN></TD></TR>");

	for(i=0; i < links.length; i++)
	{
		if(keywords[i].toLowerCase().indexOf(phrase) > -1)
		{
			checker++;
			output.document.write('<TR><TD valign=top class=searchNum width="10%">' + checker + '</TD>');
			output.document.writeln('<TD valign=top><A href="' + links[i] + '" target=main>' + titles[i] + '</A></TD></TR>');
		}
	}

	if(checker > 1)
	{
		output.document.writeln("<TR><TD colspan=2><B>" + checker + " matches found.</B></TD></TR>");
	}
	else if(checker == 1)
	{
		output.document.writeln("<TR><TD colspan=2><B>" + checker + " match found.</B></TD></TR>");
	}
	else
	{
		output.document.writeln("<TR><TD colspan=2><B>No matches found.</B></TD></TR>");
	}
	output.document.write("</TABLE></BODY></HTML>");
	output.document.close();
}