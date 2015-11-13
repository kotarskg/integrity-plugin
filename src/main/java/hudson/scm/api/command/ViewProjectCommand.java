// $Id: $
// (c) Copyright 2015 by PTC Inc. All rights reserved.
//
// This Software is unpublished, valuable, confidential property of
// PTC Inc. Any use or disclosure of this Software without the express
// written permission of PTC Inc. is strictly prohibited.

package hudson.scm.api.command;

import com.mks.api.Command;

import hudson.scm.api.option.APIOption;
import hudson.scm.api.option.IAPIOption;

/**
 *
 * @author Author: asen
 * @version $Revision: $
 */
public class ViewProjectCommand extends BasicAPICommand
{
    public ViewProjectCommand()
    {
	cmd = new Command(Command.SI, VIEW_PROJECT_COMMAND);
	
	// TODO: this is a bug. This command should be run with interim = true as per original code, but this fails somehow
	//runCommandWithInterim = true;
	
	// Initialize defaults
	cmd.addOption(new APIOption(IAPIOption.RECURSE));
    }
}
