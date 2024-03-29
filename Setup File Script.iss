; Script generated by the Inno Setup Script Wizard.
; SEE THE DOCUMENTATION FOR DETAILS ON CREATING INNO SETUP SCRIPT FILES!

#define MyAppName "Success Class Manager"
#define MyAppVersion "2.0"
#define MyAppPublisher "PCS-Creations"
#define MyAppExeName "Success Class Manager.exe"
#define MyAppAssocName MyAppName + " File"
#define MyAppAssocExt ".sif"
#define MyAppAssocKey StringChange(MyAppAssocName, " ", "") + MyAppAssocExt

[Setup]
; NOTE: The value of AppId uniquely identifies this application. Do not use the same AppId value in installers for other applications.
; (To generate a new GUID, click Tools | Generate GUID inside the IDE.)
AppId={{18AF076C-4F5F-420B-B27E-149209616FCE}
AppName={#MyAppName}
AppVersion={#MyAppVersion}
;AppVerName={#MyAppName} {#MyAppVersion}
AppPublisher={#MyAppPublisher}
DefaultDirName={autopf}\{#MyAppName}
ChangesAssociations=yes
DisableProgramGroupPage=yes
; Uncomment the following line to run in non administrative install mode (install for current user only.)
;PrivilegesRequired=lowest
PrivilegesRequiredOverridesAllowed=dialog
OutputDir=E:\setupfiles
OutputBaseFilename=Success Class Manager Setup
SetupIconFile=E:\exefiles\Project Icon.ico
Compression=lzma
SolidCompression=yes
WizardStyle=modern

[Languages]
Name: "english"; MessagesFile: "compiler:Default.isl"

[Tasks]
Name: "desktopicon"; Description: "{cm:CreateDesktopIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked

[Files]
Source: "E:\exefiles\Application_v3\{#MyAppExeName}"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\exefiles\Application_v3\Sources\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "xampp-windows-x64-8.1.6-0-VS16-installer.exe"; DestDir: "{tmp}"; Flags: deleteafterinstall
; NOTE: Don't use "Flags: ignoreversion" on any shared system files

[Registry]
Root: HKA; Subkey: "Software\Classes\{#MyAppAssocExt}\OpenWithProgids"; ValueType: string; ValueName: "{#MyAppAssocKey}"; ValueData: ""; Flags: uninsdeletevalue
Root: HKA; Subkey: "Software\Classes\{#MyAppAssocKey}"; ValueType: string; ValueName: ""; ValueData: "{#MyAppAssocName}"; Flags: uninsdeletekey
Root: HKA; Subkey: "Software\Classes\{#MyAppAssocKey}\DefaultIcon"; ValueType: string; ValueName: ""; ValueData: "{app}\{#MyAppExeName},0"
Root: HKA; Subkey: "Software\Classes\{#MyAppAssocKey}\shell\open\command"; ValueType: string; ValueName: ""; ValueData: """{app}\{#MyAppExeName}"" ""%1"""
Root: HKA; Subkey: "Software\Classes\Applications\{#MyAppExeName}\SupportedTypes"; ValueType: string; ValueName: ".myp"; ValueData: ""

[Icons]
Name: "{autoprograms}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"
Name: "{autodesktop}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"; Tasks: desktopicon

[Run]
Filename: "{app}\{#MyAppExeName}"; Description: "{cm:LaunchProgram,{#StringChange(MyAppName, '&', '&&')}}"; Flags: nowait postinstall skipifsilent
Filename: "{tmp}\xampp-windows-x64-8.1.6-0-VS16-installer.exe"; Parameters: "--prefix ""{app}"" --mode unattended"; Check: ShouldInstallXampp; Flags: waituntilterminated
;Filename: "{tmp}\xampp-windows-x64-8.1.6-0-VS16-installer.exe"; Parameters: "--prefix ""{app}"" --mode unattended"; Flags: waituntilterminated

[Code]
var
  XamppPage: TInputOptionWizardPage;
  XamppPath: string;

function ShouldInstallXampp: Boolean;
begin
  Result := not XamppPage.Values[0];
end;

procedure InitializeWizard;
begin
  // Check if C:\xampp exists
  if DirExists('C:\xampp') then
    XamppPath := 'C:\xampp'
  else
    XamppPath := ExpandConstant('{pf}\xampp');

  // Create the XAMPP installation page
  XamppPage :=
    CreateInputOptionPage(
      wpWelcome,
      'XAMPP Installation',
      'Do you have XAMPP installed?',
      'Please select one of the following options:',
      True,
      False
    );
  XamppPage.Add('Yes, I have XAMPP installed');
  XamppPage.Add('No, I do not have XAMPP installed');
end;

function NextButtonClick(CurPageID: Integer): Boolean;
begin
  Result := True;
  if CurPageID = XamppPage.ID then
  begin
    if XamppPage.Values[0] then
    begin
      // Check if XAMPP is installed in C:\xampp
      if CompareText(XamppPath, 'C:\xampp') = 0 then
      begin
        // Don't install XAMPP, but continue with the installation
      end
      else
      begin
        // Don't install XAMPP, but abort the installation
        MsgBox('Xampp is not installed in the default directory, that is C:\xampp. This software installs XAMPP to C:\xampp location for its functions. If multiple XAMPP installations are present on the same PC, it may cause critical malfunctions. Please uninstall any existing XAMPP installations before installing this software.', mbError, MB_OK);
        Result := False;
      end;
    end
    else
    begin
      // Install XAMPP and continue with the rest of the installation
      ExtractTemporaryFile('xampp-windows-x64-8.1.6-0-VS16-installer.exe');
    end;
  end;
end;
