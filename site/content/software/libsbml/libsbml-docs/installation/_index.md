+++
#=====================================================================
title  = "Downloading and installing libSBML"
date   = 2020-03-24
layout = "single"
#=====================================================================
+++

{{< toc >}}

We offer ready-to-use installers for many operating systems and programming languages, so most users don't need to build [libSBML](/software/libSBML) themselves (though that's an option too!).

Note: _stable_ releases of libSBML contain support for only the accepted parts of SBML and finalized SBML Level&nbsp;3 packages, while _experimental_ releases contain code for SBML Level&nbsp;3 packages that have not been finalized.  Please use table at right to find the appropriate instructions for your case.

## MATLAB

For _stable_ releases of libSBML, we provide a unified installer for all versions of MATLAB and all operating systems.  The result is ready to run after installation; it **does not need compilation**, and only requires you tell MATLAB where you placed the files. Here are the steps:

<ol>
<li><a target="_blank" href="https://sourceforge.net/projects/sbml/files/libsbml/MATLAB%20Interface">Download the distribution archive file</a> from SourceForge.</li>
<li>Extract the archive somewhere on your local computer.</li>
<li>Start your copy of MATLAB, then <i>either</i>:
  <ol style="list-style-type: lower-alpha">
    <li>Add that folder to your MATLAB path using MATLAB's <code>addPath</code> command.</li>
    <li>Verify it works: change into that folder within your running MATLAB environment and issue the command <code>TranslateSBML('test.xml')</code>. If all is well, the output will be a MATLAB data structure.</li>
    <li>Save the changes to your MATLAB path for future use. You can use MATLAB's standard <code>savepath</code> command.</li>
  </ol>
  <i>or</i>
  <ol style="list-style-type: lower-alpha">
  <li>Navigate to the directory where you extracted the archive downloaded in step #1.</li>
  <li>Run <code>installSBML</code>, which performs the above steps.</li>
  </ol>
</li>
</ol>

Note that the MATLAB installation archive contains _only_ the MATLAB interface; it does **not** contain the core libSBML library or language libSBML API interfaces for other programming languages.

## Python

We provide four ways to obtain the libSBML Python interface. Please use whichever one you prefer.


### Alternative 1: using Conda

We provide the libSBML Python interface through [Anaconda Cloud](http://anaconda.org/sbmlteam). To get the **stable** release of libSBML using [conda](http://conda.pydata.org/docs/), run the following command in a terminal:

    conda install -c SBMLTeam python-libsbml

_Alternatively_, if you want to install the **experimental** release of libSBML using [conda](http://conda.pydata.org/docs/), run the following command in a terminal:

    conda install -c SBMLTeam python-libsbml-experimental

After this, you should be able to access the Python language interface for libSBML directly from your Python programs by importing it like any other Python module.  In other words, `import libsbml` should work in your Python program.


### Alternative 2: using `pip` from PyPI

First, if you do not have [pip](https://pip.pypa.io/en/stable/installing/) or are uncertain if you do, run the following command in a terminal:

    sudo python3 -m ensurepip

Then, to install the **stable** release of libSBML, run the following command:

    sudo python3 -m pip install python-libsbml --upgrade

_Alternatively_, if you want to install the **experimental** release of libSBML, run the following command:

    sudo python3 -m pip install python-libsbml-experimental --upgrade

Note that in either case, **the process may take a long time** because on some operating system versions, it must install and build dependent libraries.  Please be patient.  If all goes well, the steps above should result in `pip` eventually printing the following message to tell you has it finished successfully:

    Successfully installed python-libsbml
    Cleaning up...

After this, you should be able to access the Python language interface for libSBML directly from your Python programs by importing it like any other Python module.  In other words, `import libsbml` should work in your Python program.


### Alternative 3: using `apt-get` or `yum` on Linux

If you are running Linux, and you prefer to use the standard over-the-air installation tools provided by your operating system (e.g., `yum` and `apt-get`), you can take advantage of online repositories of installers we provide using the [OpenSUSE Build System](https://build.opensuse.org/) (OBS). You can find instructions for many different flavors of Linux including CentOS, Fedora, Ubuntu, and others, at the following URLs:

* For the stable release: [python-libsbml](http://software.opensuse.org/download.html?project=home%3Afbergman%3Alibsbml&package=python-libsbml)
* For the experimental release: [python-libsbml-experimental](http://software.opensuse.org/download.html?project=home%3Afbergman%3Alibsbml&package=python-libsbml-experimental)

After this, you should be able to access the Python language interface for libSBML directly from your Python programs by importing it like any other Python module.  In other words, `import libsbml` should work in your Python program.


### Alternative 4: using the Windows libSBML installer for Python

You can take advantage of executable installers that we make available for Windows. They can be found in a subdirectory named **python**  within each of the Windows subdirectories ([stable](https://sourceforge.net/projects/sbml/files/libsbml/{{LibSBMLStableRelease}}/stable/Windows) and [experimental](https://sourceforge.net/projects/sbml/files/libsbml/{{LibSBMLStableRelease}}/experimental/binaries/Windows/python/)) on SourceForge. There are different installers for different versions of Python.  The following screenshot shows an example.

<figure>
<img width="85%" class="screenshot" src="windows-python-installers.png"/>
</figure>

After you download an appropriate `.exe` file for your system, run the installer. The installer will lead you through the installation process. Note: Windows may produce a security warning about the installer being from an unknown publisher. **Please tell Windows to proceed** despite this warning.

After that, you should be able to access the Python language interface for libSBML directly from your Python programs by importing it like any other Python module.  In other words, `import libsbml` should work in your Python program.


## C, C++, C#, Java, JavaScript, Perl, PHP, or Ruby

The installation packages in the libSBML [download site]({{LibSBMLDownloadURL}}) contain interfaces for C, C++, C#, Java, JavaScript, Perl, PHP, Python, and Ruby in the same package. (However, there are better ways to get the Python interface, as explained above.) The download area has two subdirectories: one for stable releases of libSBML, and one for experimental releases.

<figure>
<img width="85%" class="screenshot" src="sourceforge-download.png"/>
</figure>

Click on either _stable_ or _experimental_, and then navigate to a subdirectory matching your operating system platform. Download the appropriate installer or package file for your platform, and use the appropriate platform-specific approach to install the software. (E.g., if you downloaded a Mac `.dmg` file, double-click the file in the Mac Finder to mount the disk image, open the image contents in the Finder, and finally, double-click the `.pkg` file contained inside.)

After this, you should be able to access the Python language interface for libSBML directly from your Python programs by importing it like any other Python module.  In other words, `import libsbml` should work in your Python program.

## R

We provide installers for the stable version of the libSBML R language interface for Linux, Mac OS X and Windows. Download the version that is appropriate for your situation:

* _For **Linux and Mac OS X**_: Download the [libSBML R source package](http://sf.net/projects/sbml/files/libsbml/{{LibSBMLStableRelease}}) from SourceForge.

* _For **Windows**_: Download the [https://sourceforge.net/projects/sbml/files/libsbml/{{LibSBMLStableRelease}}/stable/Windows/64-bit/R%20interface/ 64-bit version] or the [https://sourceforge.net/projects/sbml/files/libsbml/{{LibSBMLStableRelease}}/stable/Windows/32-bit/R%20interface/ 32-bit version] of the binary installer for R.

Once you have downloaded the appropriate version, one more step is required to install the libSBML R interface. You can do this step in **one of two ways**: either using the R graphical interface, or using a terminal/shell command.  


### Using the R GUI

From the R menu **Packages** or **Packages & Data** (depending on your operating system), select the **Package Installer** item. You will be presented with an interface that lets you install a local binary package. Use that interface to navigate to the directory where you copied the libSBML archive file, and select the archive file for installation.


### Using a shell command

Suppose that the path to the libSBML R archive on your computer is <span style="background-color: #ffcc99; font-style: italic">archive</span>. Execute the following command in a terminal/shell window (note: **not** in the R command line interpreter!):
<pre>
R CMD INSTALL <span style="background-color: #ffcc99; font-style: italic">archive</span>
</pre>

If all goes well, you should see R print messages. If you're using the source package, it will be something such as the following (the paths on your computer may differ):

    * installing to library ‘/Library/Frameworks/R.framework/Versions/3.1/Resources/library’
    * installing *binary* package ‘libSBML’ ...
    * DONE (libSBML)

whereas if you are using a binary package, the messages will be something like the following instead:

	> utils:::menuInstallLocal()
      package ‘libSBML’ successfully unpacked and MD5 sums checked
	>

From this point forward, you should be able to call on libSBML functions from within your copy of R. You can test whether the installation was successful by trying the following command in R:

	library('libSBML')

If R does not report an error when you execute this command, then the
libSBML R interface is probably installed correctly.

## Other languages

If no installation package is available for your platform, or you have special requirements for libSBML's configuration, you can always build libSBML from sources.

# [{{LibSBMLDownloadURL}} Download libSBML] from our SourceForge distribution site.
# [{{LibSBMLDocsRoot}}/cpp-api/libsbml-installation.html Follow the instructions] for configuring, compiling and installing libSBML manually.